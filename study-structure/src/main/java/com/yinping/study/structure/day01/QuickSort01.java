package com.yinping.study.structure.day01;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.structure.day01
 * @date : 2020-04-10 19:38
 **/
public class QuickSort01 {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 8, 5, 2, 7, 4, 1};

        sort(arr,0,arr.length-1);
        System.out.println();
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr, int leftBound, int rightBound) {

        if (leftBound >= rightBound)return;
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid+1, rightBound);//因为返回的是中间的点，所以两边递归的边界分别为mid-1和mid+1
    }

    static int partition(int[] arr, int leftBound, int rightBound) {//需要一个返回值，方便后面的递归
        int pivod = arr[rightBound];
        int left = leftBound;
        int right = rightBound -1;
        while(left <= right){
            while(left <= right && arr[left] <= pivod) left ++;
            /*System.out.println(left);
            System.out.println();*/
            print(arr);
            while(left <= right && arr[right] > pivod) right --;
            if (left < right)swap(arr,left,right);
        }
        swap(arr,left,rightBound);
        System.out.println("left"+left);
        return left;



    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
