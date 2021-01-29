package B7_AbstractClassInterface.ThucHanh.Comparator;

import B6_KeThua.ThucHanh.CacDoiTuongHinhHoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]= new Circle(3.6);
        circles[0]= new Circle(4.0);
        circles[0]= new Circle(5.1);

        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
