package guru.qa.springws.domain;

import guru.qa.springws.domain.entity.UsersEntity;

import java.util.Date;

public class User {

    private String username;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static User formUserEntity(UsersEntity ue) {
        User usr = new User();
        usr.setDate(new Date());
        usr.setUsername(ue.getUsername());
        return usr;
    }
}
