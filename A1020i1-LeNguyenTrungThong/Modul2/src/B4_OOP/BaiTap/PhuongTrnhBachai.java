package B4_OOP.BaiTap;

public class PhuongTrnhBachai {
    double a, b, c;

    public PhuongTrnhBachai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return (b*b)-4*a*c;
    }

    public static void main(String[] args) {
        PhuongTrnhBachai pt = new PhuongTrnhBachai(1,3,1);
        double m = pt.delta();

        if (m>0) {
            System.out.println((-pt.b + Math.sqrt(m)) / 2 * pt.a);
            System.out.println((-pt.b - Math.sqrt(m)) / 2 * pt.a);
        }else if (m==0){
            System.out.println(-pt.b/2*pt.a);
        }else{
            System.out.println("pt vo nghiem");
        }
    }
}
