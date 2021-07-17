package model.bean;

public class CandidateIntern extends Candidate{
    private String majors;
    private String semester;  //hocj kif dang hocj
    private String universityName;

    public CandidateIntern() {
    }

    public CandidateIntern(int candidateID, String fullName, String birthDay, String phone, String email,
                           int candidateType, int candidateCount, String certificated, String majors,
                           String semester, String universityName) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, candidateCount, certificated);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }


    @Override
    public String showInfor() {
        return super.toString()+
                "CandidateIntern{" +
                "majors='" + majors + '\'' +
                ", Semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
