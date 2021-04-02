package B5_Access_Modifier.BaiTap;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    void Circle(){

    }

    void circle(double r){

    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        AccessModifier circle1 = new AccessModifier();
        circle1.getArea();
        circle1.getRadius();

        circle1.radius =10;
        System.out.println(circle1.getArea());
    }
}
