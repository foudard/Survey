package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String value;
    private Poll poll;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public Response(int id, String value, Poll poll) {
        this.id = id;
        this.value = value;
        this.poll = poll;
    }

    public Response(String value, Poll poll) {
        this.value = value;
        this.poll = poll;
    }
}
