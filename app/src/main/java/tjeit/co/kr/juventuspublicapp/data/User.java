package tjeit.co.kr.juventuspublicapp.data;

import org.json.JSONException;
import org.json.JSONObject;

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
    private String address;

    public static User getUserFromJson(JSONObject jsonObject) {
        User u = new User();

        try {
            u.userId = jsonObject.getString("userId");
            u.password = jsonObject.getString("pw");
            u.name = jsonObject.getString("name");
            u.phoneNum = jsonObject.getString("phone");
            u.address = jsonObject.getString("address");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return u;
    }

    public User() {

    }

    public User(int id, String userId, String password, String name, String phoneNum, String address) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
