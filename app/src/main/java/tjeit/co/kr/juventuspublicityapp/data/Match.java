package tjeit.co.kr.juventuspublicityapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-20.
 */

public class Match implements Serializable {

    private String homeTeamNam;
    private String homeTeamImg;
    private String awayTeamName;
    private String awayTeamImg;

    public Match() {

    }

    public Match(String homeTeamNam, String homeTeamImg, String awayTeamName, String awayTeamImg) {
        this.homeTeamNam = homeTeamNam;
        this.homeTeamImg = homeTeamImg;
        this.awayTeamName = awayTeamName;
        this.awayTeamImg = awayTeamImg;
    }

    public String getHomeTeamNam() {
        return homeTeamNam;
    }

    public void setHomeTeamNam(String homeTeamNam) {
        this.homeTeamNam = homeTeamNam;
    }

    public String getHomeTeamImg() {
        return homeTeamImg;
    }

    public void setHomeTeamImg(String homeTeamImg) {
        this.homeTeamImg = homeTeamImg;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamImg() {
        return awayTeamImg;
    }

    public void setAwayTeamImg(String awayTeamImg) {
        this.awayTeamImg = awayTeamImg;
    }
}
