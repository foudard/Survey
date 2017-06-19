package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.*;
import java.util.List;

@Entity(name = "poll")
public class Poll {

    private Integer id;
    private String name;
    private String description;
    private java.sql.Date dateBegin;
    private java.sql.Date dateEnd;
    private User user;
    private List<Response> responses;

    public Poll() {}

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "id") })
    public User getUser() { return user; }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "poll" )
    public List<Response> getResponses() { return this.responses; }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }
}
