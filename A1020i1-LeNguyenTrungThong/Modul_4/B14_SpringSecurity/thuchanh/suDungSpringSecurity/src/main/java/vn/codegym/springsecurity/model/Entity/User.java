package vn.codegym.springsecurity.model.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private boolean isEnable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    public User(){}

    public User(String username, String password, boolean isEnable, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.isEnable = isEnable;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> users) {
        this.roles = users;
    }
}
