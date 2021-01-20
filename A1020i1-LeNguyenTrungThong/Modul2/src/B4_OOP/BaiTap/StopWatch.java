package B4_OOP.BaiTap;
import java.util.Date;
import java.util.Scanner;
public class StopWatch {
    public static class StopWatch1{
        private long startTime;
        private long endTime;

        public StopWatch1(){
        }

        public void start(){
            startTime = System.currentTimeMillis();
        }

        public void end(){
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime(){
            return endTime - startTime;
        }
    }

    public static void main(String[] args) {
        StopWatch1 stopWatch = new StopWatch1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start stop watch? Y/N");
        char choice = scanner.next().charAt(0);
        switch (choice){
            case 'y':
                stopWatch.start();
                System.out.println("Counting...");
                System.out.println("Input \"show\" if you want to show elapsed time, \"stop\" if you want to stop.");
                String command;
                do{
                    command = scanner.nextLine();
                    if (command.equals("show")){
                        stopWatch.end();
                        System.out.println(stopWatch.getElapsedTime()/1000.0);
                    }
                    else if (command.equals("stop")){
                        break;
                    }
                }while (true);
                stopWatch.end();
                System.out.println(stopWatch.getElapsedTime()/1000.0 + " seconds");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}