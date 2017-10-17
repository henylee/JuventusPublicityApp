package tjeit.co.kr.juventuspublicityapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class News implements Serializable {

    private String imageURL;
    private String content;

    public News() {

    }

    public News(String imageURL, String content) {
        this.imageURL = imageURL;
        this.content = content;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
