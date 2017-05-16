package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String pseudo;
    private int age;
    private AgeGroup ageGroup;
    private Response response;

    public int getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Result(int id, String pseudo, int age, AgeGroup ageGroup, Response response) {
        this.id = id;
        this.pseudo = pseudo;
        this.age = age;
        this.ageGroup = ageGroup;
        this.response = response;
    }

    public Result(String pseudo, int age, AgeGroup ageGroup, Response response) {
        this.pseudo = pseudo;
        this.age = age;
        this.ageGroup = ageGroup;
        this.response = response;
    }
}
