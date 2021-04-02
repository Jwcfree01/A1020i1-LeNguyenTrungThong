package hkt;

import java.util.Scanner;

class problem_d {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] input = sc.nextLine().split(" ");
        double[] rgb = {Double.parseDouble(input[0]), Double.parseDouble(input[1]), Double.parseDouble(input[2])};
        double r = rgb[0] / 255;
        double g = rgb[1] / 255;
        double b = rgb[2] / 255;
        double cmax = r, cmin = r;
        if (g > cmax) {
            cmax = g;
        } else if (g < cmin) {
            cmin = g;
        }
        if (b > cmax) {
            cmax = b;
        } else if (b < cmin) {
            cmin = b;
        }
        double diff = cmax - cmin;
        int h;
        if (diff == 0) {
            h = 0;
        } else if (cmax == r) {
            h = (int) (60 * ((g - b) / diff) + 360) % 360;
        } else if (cmax == g) {
            h = (int) (60 * ((b - r) / diff) + 120) % 360;
        } else {
            h = (int) (60 * ((r - g) / diff) + 240) % 360;
        }
        double s;
        if (cmax == 0) {
            s = 0;
        } else {
            s = diff / cmax * 100;
        }
        double v = cmax * 100;

        s = (double) Math.round(s * 10) / 10;
        v = (double) Math.round(v * 10) / 10;
        System.out.println(h + " " + s + " " + v);
    }
}
