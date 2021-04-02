package hkt;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        System.out.println("Enter input string");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Enter number of string");
        int n = s.nextInt();
        String[] str = new String[n];
        System.out.println("Enter dataset");
        int len = 0;
        for (int i = 0; i < n; i++) {
            s = new Scanner(System.in);
            str[i] = s.nextLine();
            String[] temp = str[i].split(" ");
            if (len < temp.length) {
                len = temp.length;
            }
        }

        String[] vocab = new String[n * len];
        int[][] d = new int[n][n * len];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * len; j++) {
                d[i][j] = 0;
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            String[] w = str[i].split(" ");
            for (int j = 0; j < w.length; j++) {
                if (k == 0) {
                    vocab[k] = w[j];
                    d[i][k] = 1;
                    k = k + 1;
                } else {
                    boolean f = false;
                    for (int t = 0; t < k; t++) {
                        if (w[j].equals(vocab[t])) {
                            d[i][t] = d[i][t] + 1;
                            f = true;
                        }
                    }
                    if (!f) {
                        vocab[k] = w[j];
                        d[i][k] = 1;
                        k = k + 1;
                    }
                }
            }
        }

        String[] arr = input.split(" ");
        int m = Math.max(k, arr.length) + 1;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                if (vocab[j].equals(arr[i])) {
                    a[i] = a[i] + 1;
                }
            }
        }
        double[] rank = new double[n];
        for (int i = 0; i < n; i++) {
            double ts = 0;
            double ms1 = 0, ms2 = 0;
            for (int j = 0; j < k; j++) {
                ts = ts + a[j] * d[i][j];
                ms1 = ms1 + a[j] * a[j];
                ms2 = ms2 + d[i][j] * d[i][j];
            }
            if ((ms1 != 0) && (ms2 != 0)) {
                rank[i] = ts / (Math.sqrt(ms1) * Math.sqrt(ms2));
            }
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rank[i] < rank[j]) {
                    double temp = rank[i];
                    rank[i] = rank[j];
                    rank[j] = temp;
                    String st = str[i];
                    str[i] = str[j];
                    str[j] = st;
                }
            }
        }
        for (int i = 0; i < n; i++) {
     rank[i] = (double) Math.round(rank[i] * 100) / 100;
            System.out.println(str[i] + "\t" + rank[i]);
        }
    }
}
