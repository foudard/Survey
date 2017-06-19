package model;

/**
 * Created by Val on 16/05/2017.
 */

import javax.persistence.*;

@Entity(name = "age_group")
public class AgeGroup {

    private Integer id;
    private String name;

    public AgeGroup () {}

    @Id
    @Column(name = "id")
    public int getId() {
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
}
