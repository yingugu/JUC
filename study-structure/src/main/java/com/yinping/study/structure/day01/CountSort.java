package com.yinping.study.structure.day01;

import java.util.Arrays;

/**
 * <h3>study</h3>
 * <p>计数排序</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day01
 * @date : 2020-04-10 20:34
 **/
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));

        /*for (int i = 0, j = 0; i < count.length; i++) {
            while(count[i]-- > 0)result[j++] = i;
        }*/
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }//倒序
        return result;
    }
}
