
package cc.soham.news.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetArticlesResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("sortBy")
    @Expose
    private String sortBy;
    @SerializedName("articles")
    @Expose
    private List<Article> articles = new ArrayList<Article>();

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * 
     * @param sortBy
     *     The sortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * 
     * @return
     *     The articles
     */
    public List<Article> getArticles() {
        return articles;
    }

    /**
     * 
     * @param articles
     *     The articles
     */
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}
