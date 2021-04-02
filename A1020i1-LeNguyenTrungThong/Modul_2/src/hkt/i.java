//package hkt;
//
//import java.lang.reflect.Array;
//
//public class i {
//    char[][] Array = new char[][]{
//            {' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
//            {' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
//    };
//    int [] rotated = RotateMatrix(Array, 8);
//    static int[,] RotateMatrix(int[] matrix, int n) {
//        int[,] ret = new int[n, n];
//
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < n; ++j) {
//                ret[i, j] = matrix[n - j - 1, i];
//            }
//        }
//
//        return ret;
//    };
