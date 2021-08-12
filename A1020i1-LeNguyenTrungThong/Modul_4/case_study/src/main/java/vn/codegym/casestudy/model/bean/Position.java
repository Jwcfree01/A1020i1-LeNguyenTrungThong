package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "position")
public class Position {
    @Id
    private String positionId;
    private String positionName;

    @OneToMany(mappedBy = "position")
    @JsonBackReference
    private Set<Employee> employeeSet;

    public Position() {
    }

    public Position(String positionId, String positionName, Set<Employee> employeeSet) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employeeSet = employeeSet;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
