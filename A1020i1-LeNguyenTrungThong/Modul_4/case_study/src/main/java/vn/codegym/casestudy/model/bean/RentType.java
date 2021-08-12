package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    private String rentTypeId;
    private String rentTypeName;
    private double rentTypeCost;

    @OneToMany(mappedBy = "rentType")
    @JsonBackReference
    private Set<Service> serviceSet;
    public RentType() {
    }

    public RentType(Set<Service> serviceSet, String rentTypeId, String rentTypeName, double rentTypeCost) {
        this.serviceSet = serviceSet;
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
    }

    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }

    public String getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(String rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }
}
