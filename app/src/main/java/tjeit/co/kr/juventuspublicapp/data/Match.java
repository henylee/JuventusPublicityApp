package tjeit.co.kr.juventuspublicapp.data;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by joeun on 2017-10-20.
 */

public class Match implements Serializable {

    private Calendar dateTime;
    private String homeTeamName;
    private String homeTeamImg;
    private String awayTeamName;
    private String awayTeamImg;

    public Match() {

    }

    public Match(Calendar dateTime, String homeTeamName, String homeTeamImg, String awayTeamName, String awayTeamImg) {
        this.dateTime = dateTime;
        this.homeTeamName = homeTeamName;
        this.homeTeamImg = homeTeamImg;
        this.awayTeamName = awayTeamName;
        this.awayTeamImg = awayTeamImg;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamNam) {
        this.homeTeamName = homeTeamNam;
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
