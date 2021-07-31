package model.bean;

public class CandidateFresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public CandidateFresher() {
    }

    public CandidateFresher(int candidateID,
                            String fullName,
                            String birthDay,
                            String phone,
                            String email,
                            int candidateType,
                            String certificated,
                            String graduationDate,
                            String graduationRank,
                            String education) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, certificated);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String showInfor() {
        return super.toString()+
                "graduationDate = " + getGraduationDate() + '\n' +
                "graduationRank = " + getGraduationRank() + '\n' +
                "education = " + getEducation() + '\n' +
                "---------------";
    }

    public int compareTo(CandidateFresher candidateFresher) {
        // sort student's name by ASC
        return this.getFullName().compareTo(candidateFresher.getFullName());
    }
}
