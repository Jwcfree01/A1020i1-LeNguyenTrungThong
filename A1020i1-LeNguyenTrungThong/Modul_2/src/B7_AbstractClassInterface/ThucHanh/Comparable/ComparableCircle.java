package B7_AbstractClassInterface.ThucHanh.Comparable;

import B6_KeThua.ThucHanh.CacDoiTuongHinhHoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()){
            return 1;
        }else if (getRadius()==o.getRadius()){
            return 0;
        }else {
            return -1;
        }
    }
}
