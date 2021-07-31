package vn.codegym.casestudy.model.bean;

public class Employee {
    private int id;
    private String name;
    private String birthday;
    private String CMND;
    private String phone;
    private String email;
    private int idEducationDegree;
    private int idPosition;
    private double salary;
    private int idDivision;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String CMND, String phone, String email, int idEducationDegree, int idPosition, double salary, int idDivision) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.CMND = CMND;
        this.phone = phone;
        this.email = email;
        this.idEducationDegree = idEducationDegree;
        this.idPosition = idPosition;
        this.salary = salary;
        this.idDivision = idDivision;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }
}
