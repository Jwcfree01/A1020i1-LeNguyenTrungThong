package vn.codegym.casestudy.model.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service")
public abstract class Service {
    @Id
    private int serviceId;
    private String servicename;
    private double serviceArea;
    private double serviceCost;
    private int maxPeople;
    private String standardRoom;
    private String description;
    private double pollArea;
    private int numberOfFloor;

    @OneToMany(mappedBy = "service")
    @JsonBackReference
    private Set<Contract> contractSet;

    @ManyToOne
    @JoinColumn(name = "rentTypeId", nullable = false, referencedColumnName = "rentTypeId")
    @JsonBackReference
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "serviceTypeId", nullable = false, referencedColumnName = "serviceId")
    @JsonBackReference
    private ServiceType serviceType;

    public Service() {
    }

    public Service(Set<Contract> contractSet, int serviceId, String servicename, double serviceArea, double serviceCost, int maxPeople, String standardRoom, String description, double pollArea, int numberOfFloor, RentType rentType, ServiceType serviceType) {
        this.contractSet = contractSet;
        this.serviceId = serviceId;
        this.servicename = servicename;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.description = description;
        this.pollArea = pollArea;
        this.numberOfFloor = numberOfFloor;
        this.rentType = rentType;
        this.serviceType = serviceType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPollArea() {
        return pollArea;
    }

    public void setPollArea(double pollArea) {
        this.pollArea = pollArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
