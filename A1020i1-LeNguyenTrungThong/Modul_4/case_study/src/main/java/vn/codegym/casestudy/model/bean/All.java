package vn.codegym.casestudy.model.bean;

public abstract class All {
    private int id;
    private String nameService;
    private double areaService;
    private double costService;
    private int maxPeople;
    private String rentTypeId;

    public All() {
    }

    public All(String nameService, double areaService, double costService, int maxPeople, String rentTypeId) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaService() {
        return areaService;
    }

    public void setAreaService(double areaService) {
        this.areaService = areaService;
    }

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
        this.costService = costService;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(String rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    @Override
    public String toString() {
        return "All{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", areaService=" + areaService +
                ", costService=" + costService +
                ", maxPeople=" + maxPeople +
                ", rentTypeId='" + rentTypeId + '\'' +
                '}';
    }

    public abstract String showInfor();
}
