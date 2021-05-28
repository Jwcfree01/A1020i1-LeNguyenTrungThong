package model.bean.employee;

public class Employee {
    int emId;
    String emName;
    String emBirthDay;
    int emIdCard;
    double emSalary;
    int emPhone;
    String emEmail;
    String emAddress;
    Position position;
    Division division;
    Education_degree education_degree;
    String userName;

    public Employee() {
    }

    public Employee(int emId, String emName, String emBirthDay, int emIdCard, double emSalary, int emPhone,
                    String emEmail, String emAddress, Position position, Division division,
                    Education_degree education_degree, String userName) {
        this.emId = emId;
        this.emName = emName;
        this.emBirthDay = emBirthDay;
        this.emIdCard = emIdCard;
        this.emSalary = emSalary;
        this.emPhone = emPhone;
        this.emEmail = emEmail;
        this.emAddress = emAddress;
        this.position = position;
        this.division = division;
        this.education_degree = education_degree;
        this.userName = userName;
    }

    public Employee(String emName, String emBirthDay, int emIdCard, double emSalary, int emPhone,
                    String emEmail, String emAddress, Position position, Division division,
                    Education_degree education_degree, String userName) {
        this.emName = emName;
        this.emBirthDay = emBirthDay;
        this.emIdCard = emIdCard;
        this.emSalary = emSalary;
        this.emPhone = emPhone;
        this.emEmail = emEmail;
        this.emAddress = emAddress;
        this.position = position;
        this.division = division;
        this.education_degree = education_degree;
        this.userName = userName;
    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmBirthDay() {
        return emBirthDay;
    }

    public void setEmBirthDay(String emBirthDay) {
        this.emBirthDay = emBirthDay;
    }

    public int getEmIdCard() {
        return emIdCard;
    }

    public void setEmIdCard(int emIdCard) {
        this.emIdCard = emIdCard;
    }

    public double getEmSalary() {
        return emSalary;
    }

    public void setEmSalary(double emSalary) {
        this.emSalary = emSalary;
    }

    public int getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(int emPhone) {
        this.emPhone = emPhone;
    }

    public String getEmEmail() {
        return emEmail;
    }

    public void setEmEmail(String emEmail) {
        this.emEmail = emEmail;
    }

    public String getEmAddress() {
        return emAddress;
    }

    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Education_degree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(Education_degree education_degree) {
        this.education_degree = education_degree;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
