package com.yinping.study.structure.day2;

/**
 * <h3>study</h3>
 * <p>冒泡排序复习</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day2
 * @date : 2020-04-11 13:12
 **/
public class MergeSort_review_well {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 8, 5, 2, 9, 6, 3};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    static void sort(int[] arr, int leftPtr, int rightBound) {
        if(leftPtr == rightBound)return;
        int mid = leftPtr + (rightBound - leftPtr) / 2;
        sort(arr, leftPtr, mid);
        sort(arr, mid +1, rightBound);
        partiton(arr, leftPtr, mid, rightBound);

    }

    static void partiton(int[] arr, int leftPtr, int rightPtr, int right) {
        int mid = rightPtr - 1;
        int[] temp = new int[right - leftPtr + 1];
        int i = leftPtr;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right)temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        while(i <= mid)temp[k++] = arr[i++];
        while(j <= right)temp[k++] = arr[j++];
        //print(temp);
        for (int l = 0; l < temp.length; l++)arr[leftPtr + l] = temp[l];
    }

    static void print(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
