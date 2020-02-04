package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};

        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        System.out.print(Arrays.toString(array));
    }
}
