package cc.soham.news.networking;

import cc.soham.news.model.GetArticlesResponse;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sohammondal on 26/10/16.
 */

public class NewsAPI {
    private static final String APIKEY = "c0aa0ab0b31946e8bc040df941ce0e7b";
    private static final String APIPATH = "https://newsapi.org/v1/";

    private static NewsService newsService = null;

    public static NewsService getApi() {
        if(newsService == null) {
            // initialize NewsService
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(APIPATH)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsService = retrofit.create(NewsService.class);
        }
        return newsService;
    }

    public interface NewsService {
        @GET("articles?apiKey=" + APIKEY)
        Call<GetArticlesResponse> getArticles(@Query("source") String source, @Query("sortBy") String sortBy);
    }
}
