package model.bean;

public class MatBang {
    int id;
    String name;
    String status;
    int area;
    int floor;
    String typeMatBang;
    double price;
    String startDate;
    String endDate;

    public MatBang(int id, String name, String status, int area, int floor, String typeMatBang, double price, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.typeMatBang = typeMatBang;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public MatBang(String name, String status, int area, int floor, String typeMatBang, double price, String startDate, String endDate) {
        this.name = name;
        this.status = status;
        this.area = area;
        this.floor = floor;
        this.typeMatBang = typeMatBang;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getTypeMatBang() {
        return typeMatBang;
    }

    public void setTypeMatBang(String typeMatBang) {
        this.typeMatBang = typeMatBang;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
