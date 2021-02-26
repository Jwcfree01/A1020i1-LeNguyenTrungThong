package CaseStudy.models;

public class Room extends services {
    String dichVuMienPhi;

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(){}

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String showInfo() {
        return super.toString()+
                "Dich vu mien phi "+getDichVuMienPhi();
    }

}
