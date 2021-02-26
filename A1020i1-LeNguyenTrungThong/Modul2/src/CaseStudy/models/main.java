package CaseStudy.models;

public class main {
    public static void main(String[] args) {
        services ser1 = new Villa("vip", "wifi", 100, 10);
        System.out.println(ser1.showInfo());

        services ser2 = new House("vip1", "wifi1", 20);
        System.out.println(ser2.showInfo());
    }
}
