package model.bean;

public class CandidateExperience extends Candidate {
    private int expInYear;
    private String proSkill;

    public CandidateExperience() {
    }

    public CandidateExperience(int candidateID, String fullName, String birthDay, String phone, String email,
                               int candidateType, int candidateCount, String certificated, int expInYear, String proSkill) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, candidateCount, certificated);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        proSkill = proSkill;
    }

    @Override
    public String showInfor() {
        return super.toString() +
                "CanidateExperience{" +
                "ExpInYear='" + expInYear + '\'' +
                ", ProSkill='" + proSkill + '\'' +
                '}';
    }
}
