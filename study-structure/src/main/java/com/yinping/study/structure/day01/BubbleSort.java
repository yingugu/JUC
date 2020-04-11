package com.yinping.study.structure.day01;

/**
 * @author : yinping
 * @package_name com.yinping.study.thread.suanfa
 * <h3>study</h3>
 * <p>冒泡排序</p>
 * @date : 2020-04-09 14:16
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {

        for (int j = a.length-1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i+1])swap(a,i,i+1);
            }
        }

    }

    /**
     * 交换方法
     * @param a
     * @param i
     * @param j
     */
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 打印方法
     * @param arr
     */
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

}
