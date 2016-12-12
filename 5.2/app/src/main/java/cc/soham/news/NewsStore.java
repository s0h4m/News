package cc.soham.news;

import java.util.ArrayList;
import java.util.List;

import cc.soham.news.model.Article;

/**
 * Created by sohammondal on 26/10/16.
 */

public class NewsStore {
    private static List<Article> newsArticles = new ArrayList<>();

    public static List<Article> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<Article> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
