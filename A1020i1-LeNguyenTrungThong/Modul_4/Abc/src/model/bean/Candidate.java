package model.bean;

public abstract class Candidate {
    private int candidateID;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private int candidateType;
    private String certificated;

    public Candidate() {
    }

    public Candidate(String fullName, String birthDay, String phone, String email, int candidateType, String certificated) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
        this.certificated = certificated;
    }

    public Candidate(int candidateID, String fullName, String birthDay, String phone, String email, int candidateType, String certificated) {
        this.candidateID = candidateID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
        this.certificated = certificated;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public String getCertificated() {
        return certificated;
    }

    public void setCertificated(String certificated) {
        this.certificated = certificated;
    }

    @Override
    public String toString() {
        return "---------------"+ "\n"+
                "candidateID = " + getCandidateID() + "\n"+
                "fullName = " + getFullName() + '\n' +
                "birthDay = " + getBirthDay() + '\n' +
                "phone = " + getPhone() + '\n' +
                "email = " + getEmail() + '\n' +
                "candidateType = " + getCandidateType() + '\n' +
                "certificated = " + getCertificated() + "\n";
    }

    public abstract String showInfor();
}
