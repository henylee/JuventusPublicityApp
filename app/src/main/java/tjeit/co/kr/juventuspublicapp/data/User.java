package tjeit.co.kr.juventuspublicapp.data;

import java.io.Serializable;

/**
 * Created by joeun on 2017-10-17.
 */

public class User implements Serializable {

    private int id;
    private String userId;
    private String password;
    private String name;
    private String phoneNum;
    private String profileURL;

    public User() {

    }

    public User(int id, String userId, String password, String name, String phoneNum, String profileURL) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.profileURL = profileURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

}
