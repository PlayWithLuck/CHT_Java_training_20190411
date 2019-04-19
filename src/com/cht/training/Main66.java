package com.cht.training;

import java.util.Arrays;

public class Main66 {
    public static void main(String[] args) {
        Integer[] array1 = {3, 1, 4, 1, 5, 9};
        String[] array2 = {"John", "Ken", "Mary", "Tim", "Mark"};
        System.out.println("array1:"+ array1);
        System.out.println("Array1:"+ Arrays.toString(array1));
        System.out.println("array2:"+ array2);
        System.out.println("Array2:"+ Arrays.toString(array2));
        Arrays.sort(array1); //基本型態不用實作comparable
        Arrays.sort(array2);
        //要sort完才能binarySearch
        System.out.println("after soft:"+ Arrays.toString(array1));
        System.out.println("after soft:"+ Arrays.toString(array2));
        System.out.println("find 1 position:" + Arrays.binarySearch(array1, 1));
        System.out.println("find 18 position:" + Arrays.binarySearch(array1, 18));
        System.out.println("find John:" + Arrays.binarySearch(array2, "John"));
        System.out.println("find Johnny position:" + Arrays.binarySearch(array2, "Johnny"));
    }
}
