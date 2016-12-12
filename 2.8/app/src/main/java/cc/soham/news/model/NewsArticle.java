package cc.soham.news.model;

/**
 * Created by sohammondal on 26/10/16.
 */

public class NewsArticle {
    private String title;
    private String details;
    private String imageUrl;
    private String time;
    private String urlToArticle;

    public NewsArticle(String title, String details, String imageUrl, String time, String urlToArticle) {
        this.title = title;
        this.details = details;
        this.imageUrl = imageUrl;
        this.time = time;
        this.urlToArticle = urlToArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrlToArticle() {
        return urlToArticle;
    }

    public void setUrlToArticle(String urlToArticle) {
        this.urlToArticle = urlToArticle;
    }
}
