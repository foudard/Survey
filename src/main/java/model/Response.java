package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.*;
import java.util.List;

@Entity(name = "response")
public class Response {

    private Integer id;
    private String value;
    private Poll poll;
    private List<Result> results;

    public Response () {}

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "poll_id", referencedColumnName = "id") })
    public Poll getPoll() {
        return this.poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "response" )
    public List<Result> getResults() { return this.results; }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
