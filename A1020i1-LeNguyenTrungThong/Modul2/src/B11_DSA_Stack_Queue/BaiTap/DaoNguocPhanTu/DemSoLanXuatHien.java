package B11_DSA_Stack_Queue.BaiTap.DaoNguocPhanTu;

import java.util.*;

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("mang co bn phan tu");

        Map<Integer, String> newMap = new TreeMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        newMap.put(4, "a");

        Set<Integer> newSet = newMap.keySet();

        for (Integer i =0; i<newMap.size(); i++){
            String n = newMap.get(i);
        }
    }


//    public static class WordFrequency {
//        public static Map findWordFrequency(String string) {
//            String[] array = string.toLowerCase().split(" ");
//            Map<String, Integer> treeMap = new TreeMap<>();
//            for (int i = 0; i < array.length; i++) {
//                String key = array[i];
//                if (treeMap.containsKey(key)) {
//                    int value = treeMap.get(key);
//                    treeMap.replace(key, ++value);
//                } else {
//                    treeMap.put(key, 1);
//                }
//            }
//            return treeMap;
//        }
//
//        public static void main(String[] args) {
//            String str = "   Hello 2021   C1120G1    hello 2020    hello    ";
//            String newString = str.toLowerCase().trim().replaceAll("\\s+", " ");
//            System.out.println(newString);
//            Map treeMap = findWordFrequency(newString);
//            Set<String> keySet = treeMap.keySet();
//            for (String key : keySet) {
//                System.out.println(key + " : " + treeMap.get(key));
//            }
//        }
    }
