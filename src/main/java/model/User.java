package model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.print.DocFlavor;
import java.util.Collection;
import java.util.List;

/**
 * Created by Nico on 11/02/2016.
 */
@Entity(name = "user")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinTable(name = "role", joinColumns = {
//            @JoinColumn(name = "id", nullable = false, updatable = false) },
//            inverseJoinColumns = { @JoinColumn(name = "roleId",
//                    nullable = false, updatable = false) })
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer userId) {
        this.id = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoles() {
        return roleId;
    }

    public void setRoles(int roles) {
        this.roleId = roles;
    }
}
