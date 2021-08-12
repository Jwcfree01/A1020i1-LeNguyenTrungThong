package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "division")
public class Division {
    @Id
    private String divisionId;
    private String divisionName;

    @OneToMany(mappedBy = "division")
    @JsonBackReference
    private Set<Employee> employeeSet;

    public Division() {
    }

    public Division(String divisionId, String divisionName, Set<Employee> employeeSet) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.employeeSet = employeeSet;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
