package com.yinping.study.structure.day2;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day2
 * @date : 2020-04-11 14:36
 **/
public class MergeSort_review_well02 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 8, 5, 2, 9, 6, 3};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr, int leftPtr, int rightPtr) {
        if (leftPtr == rightPtr)return;
        int mid = leftPtr + (rightPtr - leftPtr) / 2;
        sort(arr, leftPtr, mid);
        sort(arr, mid + 1, rightPtr);
        merge(arr, leftPtr, mid+1, rightPtr) ;
    }

    private static void merge(int[] arr, int leftPtr, int r, int rightPtr) {
        int mid = r - 1;
        int[] temp = new int[rightPtr - leftPtr + 1];
        int i = leftPtr;
        int j = r;
        int k = 0;
        while(i <= mid && j <= rightPtr)temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= mid)temp[k++] = arr[i++];
        while (j <= rightPtr)temp[k++] = arr[j++];
        for (int l = 0; l < temp.length; l++) arr[leftPtr + l] = temp[l];
    }
}
