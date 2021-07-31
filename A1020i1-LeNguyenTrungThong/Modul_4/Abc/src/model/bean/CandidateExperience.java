package model.bean;

public class CandidateExperience extends Candidate {
    private int expInYear;
    private String proSkill;

    public CandidateExperience() {
    }

    public CandidateExperience(int candidateID, String fullName, String birthDay, String phone, String email,
                               int candidateType, String certificated, int expInYear, String proSkill) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, certificated);
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
                "expInYear = " + expInYear + '\n' +
                "proSkill = " + proSkill + '\n' +
                "---------------";
    }
}
