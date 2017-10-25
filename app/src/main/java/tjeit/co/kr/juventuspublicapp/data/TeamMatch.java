package tjeit.co.kr.juventuspublicapp.data;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class TeamMatch implements Serializable {

    private int id;
    private int rank;
    private String teamName; // 팀명
    private int nom; // 경기수
    private int vf; // 승점
    private int win; // 승
    private int tie; // 무
    private int lose; // 패
    private int score; // 득점
    private int losePoint; // 실점
    private int df; // 득실차
    private String teamLogo; // 팀 로고
    private String teamCode;

    public static TeamMatch getTeamMatchFromJson(JSONObject jsonObject) {
        TeamMatch tempTeamMatch = new TeamMatch();

        try {
            tempTeamMatch.teamName = jsonObject.getString("teamName");
            tempTeamMatch.rank = jsonObject.getInt("rank");
            tempTeamMatch.nom = jsonObject.getInt("gameCount");
            tempTeamMatch.vf = jsonObject.getInt("gainPoint");
            tempTeamMatch.win = jsonObject.getInt("won");
            tempTeamMatch.tie = jsonObject.getInt("drawn");
            tempTeamMatch.lose = jsonObject.getInt("lost");
            tempTeamMatch.score = jsonObject.getInt("gainGoal");
            tempTeamMatch.losePoint = jsonObject.getInt("loseGoal");
            tempTeamMatch.df = jsonObject.getInt("goalGap");
            tempTeamMatch.teamCode = jsonObject.getString("teamCode");
            tempTeamMatch.teamLogo = "http://dthumb.phinf.naver.net/?src=http://imgsports.naver.net/images/emblem/new/worldfootball/default/"+tempTeamMatch.teamCode+".png&type=f184_184&refresh=1\" class=\"emblem\" width=\"30\" height=\"30\" alt=\"\"";

        }catch (JSONException e) {

        }

        return tempTeamMatch;
    }

    public TeamMatch() {

    }

    public TeamMatch(int id, int rank, String teamName, int nom, int vf, int win, int tie, int lose, int score, int losePoint, int df, String teamLogo, String teamCode) {
        this.id = id;
        this.rank = rank;
        this.teamName = teamName;
        this.nom = nom;
        this.vf = vf;
        this.win = win;
        this.tie = tie;
        this.lose = lose;
        this.score = score;
        this.losePoint = losePoint;
        this.df = df;
        this.teamLogo = teamLogo;
        this.teamCode = teamCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getVf() {
        return vf;
    }

    public void setVf(int vf) {
        this.vf = vf;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLosePoint() {
        return losePoint;
    }

    public void setLosePoint(int losePoint) {
        this.losePoint = losePoint;
    }

    public int getDf() {
        return df;
    }

    public void setDf(int df) {
        this.df = df;
    }

    public String getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }
}
