package model;

/**
 * Created by Val on 16/05/2017.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.List;

@Entity(name = "response")
public class Response {

    private Integer id;
    private String value;
    private Poll poll;
    private List<Result> results;

    public Response () { }
    public Response (String value, Poll poll) {
        this.value = value;
        this.poll = poll;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Transient
    public Boolean hasAnswered(String pseudo, Integer age) {
        Boolean answered = false;
        for (Result result : this.results) {
            if (result.getAge().equals(age) && result.getPseudo().equals(pseudo)) {
                answered = true;
            }
        }
        return answered;
    }
}
