package vn.codegym.casestudy.model.bean;

public class AccompaniedService {
    private int id;
    private String name;
    private int unit;
    private double price;

    public AccompaniedService() {
    }

    public AccompaniedService(int id, String name, int unit, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
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

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
