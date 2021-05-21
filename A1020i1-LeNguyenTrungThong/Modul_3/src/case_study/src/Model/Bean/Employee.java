package Model.Bean;

public class Employee {
    int emId;
    String emName;
    String emBirthDay;
    int emIdCard;
    double emSalary;
    String emPhone;
    String emEmail;
    String emAddress;
    int emIdPosition;
    int emIdEducation;
    int emIdDivision;
    String userName;

    public Employee() {
    }

    public Employee(int emId, String emName, String emBirthDay, int emIdCard, double emSalary, String emPhone,
           String emEmail, String emAddress, int emIdPosition, int emIdEducation, int emIdDivision, String userName) {
        this.emId = emId;
        this.emName = emName;
        this.emBirthDay = emBirthDay;
        this.emIdCard = emIdCard;
        this.emSalary = emSalary;
        this.emPhone = emPhone;
        this.emEmail = emEmail;
        this.emAddress = emAddress;
        this.emIdPosition = emIdPosition;
        this.emIdEducation = emIdEducation;
        this.emIdDivision = emIdDivision;
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

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
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

    public int getEmIdPosition() {
        return emIdPosition;
    }

    public void setEmIdPosition(int emIdPosition) {
        this.emIdPosition = emIdPosition;
    }

    public int getEmIdEducation() {
        return emIdEducation;
    }

    public void setEmIdEducation(int emIdEducation) {
        this.emIdEducation = emIdEducation;
    }

    public int getEmIdDivision() {
        return emIdDivision;
    }

    public void setEmIdDivision(int emIdDivision) {
        this.emIdDivision = emIdDivision;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
