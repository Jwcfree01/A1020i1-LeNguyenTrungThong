package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "attach_service")
public class AttachService {
    @Id
    private String attachServiceId;
    @OneToMany(mappedBy = "attachService")
    @JsonBackReference
    private Set<ContractDetail> contractDetails;

    private String attachServiceName;
    private double attachServiceCost;
    private int attachServiceUnit;
    private String attachServiceStatus;

    public AttachService() {
    }

    public AttachService(String attachServiceId, Set<ContractDetail> contractDetails, String attachServiceName, double attachServiceCost, int attachServiceUnit, String attachServiceStatus) {
        this.attachServiceId = attachServiceId;
        this.contractDetails = contractDetails;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }

    public String getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(String attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}

