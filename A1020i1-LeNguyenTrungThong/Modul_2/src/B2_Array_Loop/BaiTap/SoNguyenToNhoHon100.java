package B2_Array_Loop.BaiTap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int a =2;
        while (a<100) {
            boolean check = true;
            for (int i = 2; i < a; i++) {
                if (a%i==0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(a + ",");
            }
            a++;
        }
    }
}
