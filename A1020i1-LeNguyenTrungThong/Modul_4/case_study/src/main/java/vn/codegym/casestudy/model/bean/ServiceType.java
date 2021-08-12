package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    private String serviceId;
    private String serviceTypeName;

    @OneToMany(mappedBy = "serviceType")
    @JsonBackReference
    private Set<Service> serviceSet;

    public ServiceType() {
    }

    public ServiceType(String serviceId, Set<Service> serviceSet, String serviceTypeName) {
        this.serviceId = serviceId;
        this.serviceSet = serviceSet;
        this.serviceTypeName = serviceTypeName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Set<Service> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<Service> serviceSet) {
        this.serviceSet = serviceSet;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
