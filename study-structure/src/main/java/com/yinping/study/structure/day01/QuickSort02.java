package com.yinping.study.structure.day01;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day01
 * @date : 2020-04-10 19:40
 **/
public class QuickSort02 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 8, 9, 5, 2, 6, 3, 10};
        sort(arr,0,arr.length-1);
        print(arr);
    }

    private static void sort(int[] arr, int i, int length) {
        if (i >= length)return;
        int mid = partition(arr,i,length);
        sort(arr, i, mid - 1);
        sort(arr,mid + 1,length);
    }

    private static int partition(int[] arr, int leftBound, int rightBound) {
        int pivod = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while(left <= right){
            while(left <= right && arr[left] <= pivod)left ++;
            while(left <= right && arr[right] > pivod) right --;
            if (left <= right)swap(arr, left, right);
        }
        swap(arr,left,rightBound);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
