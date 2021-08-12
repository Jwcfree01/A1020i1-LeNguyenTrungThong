package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private String id;
    @NotBlank(message = "Name is not null")
    private String name;
    @NotBlank(message = "Birthday is not null" )
    private String birthday;
    @NotBlank(message = "Cmnd has a length of 9")
    private String CMND;
    @NotBlank(message = "Salary í not null")
    private double salary;
    private String phone;
    @Email(message = "Example: abc@gmail.com")
    private String email;
    @NotBlank(message = "Address is not null")
    private String address;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false, referencedColumnName = "positionId")
    @JsonBackReference
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_id", nullable = false, referencedColumnName = "educationId")
    @JsonBackReference
    private Education education;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false, referencedColumnName = "divisionId")
    @JsonBackReference
    private Division division;

    @ManyToOne
    @JoinColumn(name = "username",  referencedColumnName = "username")
    @JsonBackReference
    private User user;

    @OneToMany(mappedBy = "employee")
    @JsonBackReference
    private Set<Contract> contractSet;

    public Employee() {
    }

    public Employee(String empId, @NotBlank(message = "Name is not null") String name, @NotBlank(message = "Birthday is not null") String birthday, @NotBlank(message = "Cmnd has a length of 9") String CMND, @NotBlank(message = "Salary í not null") double salary, String phone, @Email(message = "Example: abc@gmail.com") String email, @NotBlank(message = "Address is not null") String address, Position position, Education education, Division division, User user, Set<Contract> contractSet) {
        this.id = empId;
        this.name = name;
        this.birthday = birthday;
        this.CMND = CMND;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.education = education;
        this.division = division;
        this.user = user;
        this.contractSet = contractSet;
    }

    public String getEmpId() {
        return id;
    }

    public void setEmpId(String empId) {
        this.id = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
