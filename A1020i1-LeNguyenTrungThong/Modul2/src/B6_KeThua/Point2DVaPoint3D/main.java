package B6_KeThua.Point2DVaPoint3D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();

        Point3D point3D = new Point3D();

        point2D.setXY(10,20);

        point3D.setXYZ(10,20,30);

        for (int i=0;i<point2D.getXY().length;i++){
            System.out.print(point2D.getXY()[i]);
        }

        System.out.println();

        for (int i=0;i<point3D.getXYZ().length;i++){
            System.out.print(point3D.getXYZ()[i]);
        }
    }
}
