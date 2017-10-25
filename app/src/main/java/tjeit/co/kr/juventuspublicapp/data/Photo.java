package tjeit.co.kr.juventuspublicapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class Photo implements Serializable {

    private String thumNailImg;
    private String titleText;
    private String detailDescrip;

    public Photo() {
        
    }

    public Photo(String thumNailImg, String titleText, String detailDescrip) {
        this.thumNailImg = thumNailImg;
        this.titleText = titleText;
        this.detailDescrip = detailDescrip;
    }

    public String getThumNailImg() {
        return thumNailImg;
    }

    public void setThumNailImg(String thumNailImg) {
        this.thumNailImg = thumNailImg;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDetailDescrip() {
        return detailDescrip;
    }

    public void setDetailDescrip(String detailDescrip) {
        this.detailDescrip = detailDescrip;
    }
}
