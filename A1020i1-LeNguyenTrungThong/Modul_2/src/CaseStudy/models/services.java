package CaseStudy.models;

public abstract class services {
    String nameService;
    int area;
    double cost;
    int maxPeople;
    String rentalType;
    String id;

    public services(String nameService, int area, double cost, int maxPeople, String rentalType, String id) {
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
        this.id = id;
    }

    public services(){}

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "services" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                ", id='" + id + '\''
                ;
    }

    public abstract String showInfo();
}
