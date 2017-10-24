package tjeit.co.kr.juventuspublicityapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class Photo implements Serializable {

    private String thumNailImg;
    private String priviewText;

    public Photo() {
        
    }

    public Photo(String thumNailImg, String priviewText) {
        this.thumNailImg = thumNailImg;
        this.priviewText = priviewText;
    }

    public String getThumNailImg() {
        return thumNailImg;
    }

    public void setThumNailImg(String thumNailImg) {
        this.thumNailImg = thumNailImg;
    }

    public String getPriviewText() {
        return priviewText;
    }

    public void setPriviewText(String priviewText) {
        this.priviewText = priviewText;
    }
}
