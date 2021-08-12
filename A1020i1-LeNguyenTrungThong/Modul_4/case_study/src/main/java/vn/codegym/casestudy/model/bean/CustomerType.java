package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer_type")
public class CustomerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id là KH-0001 mà để v tự tăng sao đc á //cái này là kiểu khách hàng kệ cứ để nó auto đi ok
    private String customerTypeId;

    private String customerTypeName;

    @OneToMany(mappedBy = "customerType")
    @JsonBackReference
    private Set<Customer> customerSet;

    public CustomerType() {
    }

    public CustomerType(Set<Customer> customerSet, String customerTypeId, String customerTypeName) {
        this.customerSet = customerSet;
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
