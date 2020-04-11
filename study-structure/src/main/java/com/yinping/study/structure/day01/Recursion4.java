package com.yinping.study.structure.day01;

/**
 * @author : yinping
 * @package_name com.yinping.study.thread.suanfa
 * <h3>study</h3>
 * <p>递归</p>
 * @date : 2020-04-09 17:03
 **/
public class Recursion4 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    static long f(int i) {
        if (i < 1)return -1;//base case
        if (i == 1)return 1;
        return i + f(i - 1);
    }//计算的是1+2+3+...+9+10
}
