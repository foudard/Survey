package model;

import java.util.Date;

/**
 * Created by Val on 16/05/2017.
 */
public class Poll {
    private int id;
    private String name;
    private String description;
    private Date date_begin;
    private Date date_end;
    private User user;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_begin() {
        return date_begin;
    }

    public void setDate_begin(Date date_begin) {
        this.date_begin = date_begin;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Poll(int id, String name, String description, Date date_begin, Date date_end, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date_begin = date_begin;
        this.date_end = date_end;
        this.user = user;
    }

    public Poll(String name, String description, Date date_begin, Date date_end, User user) {
        this.name = name;
        this.description = description;
        this.date_begin = date_begin;
        this.date_end = date_end;
        this.user = user;
    }
}
