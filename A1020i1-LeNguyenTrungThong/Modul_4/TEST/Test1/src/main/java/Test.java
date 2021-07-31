import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please choose you want:\n" +
                "1. Add New Candidate\n" +
                "2. Show Information Candidate\n" +
                "3. Update Candidate\n" +
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.err.println("False, please choose again, enter to continue...");
                scanner.nextLine();
                break;
        }
    }
}
