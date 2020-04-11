package com.yinping.study.structure.day01;

/**
 * <h3>study</h3>
 * <p>归并排序</p>
 *优化代码版本
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day01
 * @date : 2020-04-09 20:05
 **/
public class MergeSort_well {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr);
    }

    private static void sort(int[] arr) {

        merge(arr);
    }

    static void merge(int[] arr) {
        int mid = arr.length / 2;
        int[] temp = new int[arr.length];

        int i = 0;//指向第一个数组的第一个位置
        int j = mid + 1;//指向第二个数组的第一个位置
        int k = 0;//指向复制数组的第一个位置

        while(i <= mid && j < arr.length){
          /*  arr[i] <= arr[j] ? temp[k++] = arr[i++] : temp[k++] = arr[j++];*/
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];//由下面语句优化而来

            /*if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];

            }*/
        }

        while(i <= mid)temp[k++] = arr[i++];
        while(j < arr.length)temp[k++] = arr[j++];
        print(temp);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr [j];
        arr[j] = temp;
    }

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
