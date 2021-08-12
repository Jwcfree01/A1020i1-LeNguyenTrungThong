package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    private String roleId;
    private String roleName;

    @ManyToMany(mappedBy = "roleSet")
    @JsonBackReference
    private Set<User> userSet;

    public Role() {
    }

    public Role(String roleId, String roleName, Set<User> userSet) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.userSet = userSet;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
