public class calculator {
    public static float Calculator (float a, float b, char n) throws Exception {
        switch (n){
            case '+':
                return  a + b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b !=0) {
                    return a / b;
                }else {
                    throw new RuntimeException("err");
                }
            default:
                throw new RuntimeException("Invalid");
        }
    }
}
