package tjeit.co.kr.juventuspublicityapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class Players implements Serializable {

    private int id;
    private String name;
    private String national;
    private int backNumber;
    private int join;
    private int nationalGame;
    private int clubGame;

    public Players() {

    }

    public Players(int id, String name, String national, int backNumber, int join, int nationalGame, int clubGame) {
        this.id = id;
        this.name = name;
        this.national = national;
        this.backNumber = backNumber;
        this.join = join;
        this.nationalGame = nationalGame;
        this.clubGame = clubGame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) {
        this.backNumber = backNumber;
    }

    public int getJoin() {
        return join;
    }

    public void setJoin(int join) {
        this.join = join;
    }

    public int getNationalGame() {
        return nationalGame;
    }

    public void setNationalGame(int nationalGame) {
        this.nationalGame = nationalGame;
    }

    public int getClubGame() {
        return clubGame;
    }

    public void setClubGame(int clubGame) {
        this.clubGame = clubGame;
    }
}
