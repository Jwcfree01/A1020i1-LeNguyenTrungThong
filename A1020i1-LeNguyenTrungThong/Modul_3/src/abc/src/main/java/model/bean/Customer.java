package model.bean;

public class Customer {
    int cusId;
    String cusTypeId;
    String cusName;
    String cusBirthDay;
    String cusGender;
    String cusIdCard;
    int cusPhone;
    String cusEmail;
    String cusAddress;

    public Customer() {
    }

    public Customer(String cusTypeId, String cusName, String cusBirthDay, String cusGender, String cusIdCard,
                    int cusPhone, String cusEmail, String cusAddress) {
        this.cusTypeId = cusTypeId;
        this.cusName = cusName;
        this.cusBirthDay = cusBirthDay;
        this.cusGender = cusGender;
        this.cusIdCard = cusIdCard;
        this.cusPhone = cusPhone;
        this.cusEmail = cusEmail;
        this.cusAddress = cusAddress;
    }

    public Customer(int cusId, String cusTypeId, String cusName, String cusBirthDay, String cusGender,
                    String cusIdCard, int cusPhone, String cusEmail, String cusAddress) {
        this.cusId = cusId;
        this.cusTypeId = cusTypeId;
        this.cusName = cusName;
        this.cusBirthDay = cusBirthDay;
        this.cusGender = cusGender;
        this.cusIdCard = cusIdCard;
        this.cusPhone = cusPhone;
        this.cusEmail = cusEmail;
        this.cusAddress = cusAddress;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusTypeId() {
        return cusTypeId;
    }

    public void setCusTypeId(String cusTypeId) {
        this.cusTypeId = cusTypeId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusBirthDay() {
        return cusBirthDay;
    }

    public void setCusBirthDay(String cusBirthDay) {
        this.cusBirthDay = cusBirthDay;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getCusIdCard() {
        return cusIdCard;
    }

    public void setCusIdCard(String cusIdCard) {
        this.cusIdCard = cusIdCard;
    }

    public int getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(int cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }
}
