package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class Education {
    @Id
    private String educationId;
    private String educationName;

    @OneToMany(mappedBy = "education")
    @JsonBackReference
    private Set<Employee> employeeSet;

    public Education() {
    }

    public Education(String educationId, String educationName, Set<Employee> employeeSet) {
        this.educationId = educationId;
        this.educationName = educationName;
        this.employeeSet = employeeSet;
    }

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
