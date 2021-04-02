package B6_KeThua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle{
    private double heigh = 1.0;

    public Cylinder(double heigh) {
        this.heigh = heigh;
    }

    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh(){
        return heigh;
    }

    public double getTheTich(){
        return Math.PI*getRadius()*getRadius()*heigh;
    }

    public String toString(){
        return "Hinh tru tron co ban kinh = "+getRadius()+" va the tich = "+getTheTich();
    }
}
