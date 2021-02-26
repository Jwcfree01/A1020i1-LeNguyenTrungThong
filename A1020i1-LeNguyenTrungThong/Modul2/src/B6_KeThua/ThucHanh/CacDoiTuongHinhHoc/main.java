package B6_KeThua.ThucHanh.CacDoiTuongHinhHoc;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", true);
        System.out.println(shape);

        //Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("black", false, 3.5);
        System.out.println(circle);

        circle = new Circle(4.0);
        System.out.println(circle);

        //Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(10,20);
        System.out.println(square);

        square = new Square("blue", true, 15, 25);
        System.out.println(square);
    }
}
