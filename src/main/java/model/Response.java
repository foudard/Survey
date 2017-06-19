package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.*;

@Entity(name = "response")
public class Response {

    private int id;
    private String value;
    private int pollId;

    public Response () {}

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "poll_id")
    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }
}
