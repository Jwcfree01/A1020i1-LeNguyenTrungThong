package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    private String contractDetailId;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false, referencedColumnName = "contractId")
    @JsonBackReference
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attachService_id", nullable = false, referencedColumnName = "attachServiceId")
    @JsonBackReference
    private AttachService attachService;

    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(String contractDetailId, Contract contract, AttachService attachService, int quantity) {
        this.contractDetailId = contractDetailId;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
