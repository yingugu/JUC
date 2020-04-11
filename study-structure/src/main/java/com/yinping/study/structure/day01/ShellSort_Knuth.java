package com.yinping.study.structure.day01;

/**
 * @author : yinping
 * @package_name com.yinping.study.thread.suanfa
 * <h3>study</h3>
 * <p>希尔排序</p>
 * <p>使用Knuth序列</p>
 * @date : 2020-04-09 15:59
 **/
public class ShellSort_Knuth {
    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};

        sort(arr);

        print(arr);
    }

    static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static void sort(int[] arr) {
        for (int gap = arr.length >> 1; gap  >0; gap /= 2) {//位运算，从一半开始分，但是除二的间隔序列效率并不是最高
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >gap -1 ; j-=gap) {
                    if (arr[j] < arr[j-gap])swap(arr, j, j-gap);
                }
            }
        }
    }

    static void swap(int[] arr,int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
