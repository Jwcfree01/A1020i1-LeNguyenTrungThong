public class calculator {
    public static double Calculator(double a, double b, char n){
        switch (n) {
            case '+':
                return a + b;
            case '-':
                return (a - b);
            case '*':
                return (a * b);
            case '/':
                if (b != 0) {
                    return (a / b);
                } else {
                    throw new RuntimeException("loi chia cho 0");
                }
            default:
                throw new RuntimeException("Invalid");
        }
    }
}
