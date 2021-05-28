package model.bean.employee;

public class Education_degree {
    int idEducation;
    String name_Education;

    public Education_degree(int idEducation, String name_Education) {
        this.idEducation = idEducation;
        this.name_Education = name_Education;
    }

    public int getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(int idEducation) {
        this.idEducation = idEducation;
    }

    public String getName_Education() {
        return name_Education;
    }

    public void setName_Education(String name_Education) {
        this.name_Education = name_Education;
    }
}
