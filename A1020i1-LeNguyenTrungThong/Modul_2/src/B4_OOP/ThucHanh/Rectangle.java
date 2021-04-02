package B4_OOP.ThucHanh;

public class Rectangle {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double DienTich(){
        return width*height;
    }

    public double chuVi(){
        return (width+height)*2;
    }
    public static void main(String[] args) {
        Rectangle hinhChuNhat = new Rectangle(10, 15);
        System.out.println("Dien Tich HCN la: " + hinhChuNhat.DienTich());
        System.out.println("chu vi: " + hinhChuNhat.chuVi());

    }
}
