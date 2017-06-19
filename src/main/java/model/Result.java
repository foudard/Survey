package model;

/**
 * Created by Val on 16/05/2017.
 */

import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.*;

@Entity(name = "result")
public class Result {

    private Integer id;
    private String pseudo;
    private Integer age;
    private AgeGroup ageGroup;
    private Response response;

    public Result () {}

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pseudo")
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "age_group_id")
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Basic
    @Column(name = "response_id")
    public Response getResponse() {
        return this.response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
