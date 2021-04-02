package B6_KeThua.BaiTap.Triangle;

import B6_KeThua.ThucHanh.CacDoiTuongHinhHoc.Shape;

public class Triangle extends Shape {
    double a = 1.0;
    double b = 1.0;
    double c = 1.0;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter(){
        return (a+b+c);
    }

    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter()-this.a)*(getPerimeter()-this.b)*(getPerimeter()-this.c));
    }

    @Override
    public String toString() {
        return ("dien tich = "+getArea()+ " chu vi = "+getPerimeter());
    }
}
