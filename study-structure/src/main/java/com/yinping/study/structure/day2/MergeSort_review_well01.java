package com.yinping.study.structure.day2;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day2
 * @date : 2020-04-11 14:19
 **/
public class MergeSort_review_well01 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 8, 5, 2, 9, 6, 3};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    static void sort(int[] arr, int left, int right) {

        if(left <= right)return;
        int mid = left + (right - left) /2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int leftPrd, int right) {
        int mid = leftPrd - 1;
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right)temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j ++];
        while (i <= mid ) temp[k++] = arr[i++];
        while (j <= right)temp[k++] = arr[j++];
        for (int l = 0; l < temp.length; l++)arr[left + l] = temp[l];
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
