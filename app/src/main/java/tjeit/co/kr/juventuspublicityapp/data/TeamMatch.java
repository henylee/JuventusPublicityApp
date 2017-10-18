package tjeit.co.kr.juventuspublicityapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class TeamMatch implements Serializable {

    private int id;
    private int rank;
    private String teamLogo;
    private String teamName;
    private int nom;
    private int vf;
    private int win;
    private int tie;
    private int lose;
    private int score;
    private int losePoint;
    private int df;

    public TeamMatch() {

    }

    public TeamMatch(int id, int rank, String teamLogo, String teamName, int nom, int vf, int win, int tie, int lose, int score, int losePoint, int df) {
        this.id = id;
        this.rank = rank;
        this.teamLogo = teamLogo;
        this.teamName = teamName;
        this.nom = nom;
        this.vf = vf;
        this.win = win;
        this.tie = tie;
        this.lose = lose;
        this.score = score;
        this.losePoint = losePoint;
        this.df = df;
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

    public String getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
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
}
