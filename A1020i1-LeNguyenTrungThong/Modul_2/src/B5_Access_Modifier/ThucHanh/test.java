package B5_Access_Modifier.ThucHanh;


    public class test {
        static public int X = 2;

        public static void main(String[] args) {
            test o = new test();
            test o1 = new test();
            o1.X = 4;
            System.out.printf("x=%d, y=%d, z=%d", o.X, o1.X, test.X);
        }
}
