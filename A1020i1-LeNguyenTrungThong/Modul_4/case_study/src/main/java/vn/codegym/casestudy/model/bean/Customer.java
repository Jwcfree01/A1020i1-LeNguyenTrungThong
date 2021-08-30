package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @NotBlank(message = "Id is not null")
    private String customerId;
    @NotBlank(message = "Name is not null")
    private String name;
    @NotBlank(message = "Birthday is not null" )
    private String birthday;
    @NotBlank(message = "Gender is not null" )
    private String gender;
    @NotBlank(message = "Id card is not null" )
    private String idCard;
    @Pattern(regexp = "^[0-9+]{9,15}$", message = "phone number error or phone is not null")
    private String phone;
    @Email(message = "Email is not null")
    private String email;
    @NotBlank(message = "Address is not null" )
    private String address;

    @ManyToOne
    @JoinColumn(name = "customerType_Id", nullable = false, referencedColumnName = "customerTypeId", columnDefinition = "")
    @JsonBackReference
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private Set<Contract> contractSet;

    public Customer() {
    }

    public Customer(String customerId, String name, String birthday, String gender, String idCard, String phone, String email,
                    String address, CustomerType customerType, Set<Contract> contractSet) {
        this.customerId = customerId;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.contractSet = contractSet;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
