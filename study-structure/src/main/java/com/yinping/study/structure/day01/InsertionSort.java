package com.yinping.study.structure.day01;

/**
 * @author : yinping
 * @package_name com.yinping.study.thread.suanfa
 * <h3>study</h3>
 * <p>插入排序</p>
 * @date : 2020-04-09 15:11
 **/
public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);

    }

    static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (a[j] < a[j-1])swap(a, j, j-1);
            }
        }
    }
}
