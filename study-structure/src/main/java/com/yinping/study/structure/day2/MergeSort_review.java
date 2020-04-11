package com.yinping.study.structure.day2;

/**
 * <h3>study</h3>
 * <p>冒泡排序复习</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day2
 * @date : 2020-04-11 13:12
 **/
public class MergeSort_review {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 8, 5, 2, 9, 6, 3};
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int leftPtr, int rightBound) {
        if(leftPtr == rightBound)return;
        int mid = leftPtr + (rightBound - leftPtr) / 2;
        partiton(arr);

    }

    private static void partiton(int[] arr) {
        int mid = arr.length >> 1;
        int[] temp = new int[arr.length];
        int i = 0;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j < arr.length){
            if (arr[i] < arr[j]){

                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid)temp[k++] = arr[i++];
        while(j < arr.length)temp[k++] = arr[j++];
        print(temp);
    }

    private static void print(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
