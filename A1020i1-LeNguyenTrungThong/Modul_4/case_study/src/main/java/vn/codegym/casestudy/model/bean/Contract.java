package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    private String contractId;
    private String startDate;
    private String endDate;
    private double deposit;
    private double totalMoney;

    @ManyToOne
    @JoinColumn(name = "id_emp", nullable = false)
    @JsonBackReference
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "customerId")
    @JsonBackReference
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false, referencedColumnName = "serviceId")
    @JsonBackReference
    private Service service;

    @OneToMany(mappedBy = "contract")
    @JsonBackReference
    private Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public Contract(String contractId, String startDate, String endDate, double deposit, double totalMoney, Employee employee, Customer customer, Service service, Set<ContractDetail> contractDetails) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.contractDetails = contractDetails;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
