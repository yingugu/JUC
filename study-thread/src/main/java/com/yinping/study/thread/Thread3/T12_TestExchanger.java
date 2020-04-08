package com.yinping.study.thread.Thread3;/**
 * @package_name com.yinping.study.thread.Thread3
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 15:00
 * @since 0.1.0
 **/

import java.util.concurrent.Exchanger;

/**
 * <h3>study</h3>
 * <p>exchanger</p>
 * @author : yinping
 * @date : 2020-04-08 15:00
 **/
public class T12_TestExchanger {
    static Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        new Thread(()->{
            String s = "T1";

            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+s);
        },"t1").start();
        new Thread(()->{
            String s = "T2";

            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+s);
        },"t2").start();

    }

}
