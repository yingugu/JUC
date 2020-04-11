package com.yinping.study.structure.day01;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day01
 * @date : 2020-04-10 19:50
 **/
public class QuickSort03 {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 8, 5, 2, 7, 4, 1, 10};
        sort(arr, 0, arr.length - 1);
        print(arr);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr, int i, int i1) {
        if (i >= i1)return;

        int mid =   partition(arr, i, i1);
        sort(arr, i, mid - 1);
        sort(arr, mid + 1, i1);
    }

    private static int  partition(int[] arr, int i, int i1) {
        int pivod = arr[i1];
        int left = i;
        int right = i1 - 1;
        while(left <= right){
            while(left <= right && arr[left] <= pivod)left ++;
            while(left <= right && arr[right] > pivod)right --;
            if (left < right)swap(arr,left, right);
        }
        swap(arr,left,i1);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }
}
