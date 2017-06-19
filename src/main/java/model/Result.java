package model;

/**
 * Created by Val on 16/05/2017.
 */

import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.*;

@Entity(name = "result")
public class Result {

    private int id;
    private String pseudo;
    private int age;
    private int ageGroupId;
    private int responseId;

    public Result () {}

    @Id
    @Column(name = "id")
    public int getId() {
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
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "age_group_id")
    public int getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(int ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    @Basic
    @Column(name = "response_id")
    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }
}
