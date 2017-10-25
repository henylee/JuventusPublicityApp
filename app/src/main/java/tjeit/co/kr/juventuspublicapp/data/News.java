package tjeit.co.kr.juventuspublicapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class News implements Serializable {

    private String imageURL;
    private String title;
    private String content;

    public News() {

    }

    public News(String imageURL, String title, String content) {
        this.imageURL = imageURL;
        this.title = title;
        this.content = content;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
