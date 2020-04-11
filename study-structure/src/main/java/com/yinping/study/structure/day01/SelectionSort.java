package com.yinping.study.structure.day01;
/**
 * @package_name com.yinping.study.thread.suanfa
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-09 10:56
 * @since 0.1.0
 **/

/**
 * <h3>study</h3>
 * <p>选择排序</p>
 * @author : yinping
 * @date : 2020-04-09 10:56
 **/
public class SelectionSort {
    public static void main(String[] args) {//可以优化为每次遍历找到一个最大值一个最小值，节省了一半的时间或者在提取数的时候多提取几个
        int[] arr = {5,3,6,8,1,7,9,4,2};


        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
               /* if (arr[j] < arr[minPos]){
                    minPos = j;
                }*/
               minPos = arr[j] < arr[minPos] ? j : minPos;//使用三目运算
            }
            System.out.println(minPos);

            swap(arr,i,minPos);

            System.out.println(" the "+i+" change ");
            print(arr);
        }

        print(arr);

        String a = "9";
        String b = "8";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
    static void swap(int[] arr,int i,int j){//将交换方法提出来
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr){//将打印方法单独提出来
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
