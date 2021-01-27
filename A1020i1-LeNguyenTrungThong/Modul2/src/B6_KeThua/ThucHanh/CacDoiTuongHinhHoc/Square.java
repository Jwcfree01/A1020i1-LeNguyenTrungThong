package B6_KeThua.ThucHanh.CacDoiTuongHinhHoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double width, double height) {
        super(width, height);
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
