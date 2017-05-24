package model;

/**
 * Created by Val on 16/05/2017.
 */

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity(name = "role")
public class Role implements GrantedAuthority {

    private int id;
    private String name;

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

    @Override
    public String getAuthority() {
        return this.name;
    }
}
