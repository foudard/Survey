package model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.*;

@Entity(name = "poll")
public class Poll {

    private int id;
    private String name;
    private String description;
    private java.sql.Date dateBegin;
    private java.sql.Date dateEnd;
    private int userId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "date_begin")
    public java.sql.Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(java.sql.Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Basic
    @Column(name = "date_end")
    public java.sql.Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(java.sql.Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
