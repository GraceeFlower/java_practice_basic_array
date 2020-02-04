package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] tempArr = new int[array.length + 1];
        for (int i = 0, j = 0; i < tempArr.length; i++) {
            if (i == tempArr.length -1) {
                tempArr[i] = number;
            } else {
                tempArr[i] = array[j];
                j++;
            }
        }
        Arrays.sort(tempArr);
        return tempArr;
    }
}
