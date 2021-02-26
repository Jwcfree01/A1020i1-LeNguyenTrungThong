package B2_Array_Loop.BaiTap;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            System.out.print("*");
            for (int j=0; j<10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------------------------------");
        for (int i=0; i<5; i++){
            System.out.print("*");
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("------------------------------------");
        for (int i=5; i>0; i--){
            System.out.print("*");
            for (int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
