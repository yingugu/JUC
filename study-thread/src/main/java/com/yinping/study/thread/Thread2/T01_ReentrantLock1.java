package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 09:44
 * @since 0.1.0
 **/

import java.util.concurrent.TimeUnit;

/**
 * <h3>study</h3>
 * <p>reentrantlock</p>
 * @author : yinping
 * @date : 2020-04-08 09:44
 **/
public class T01_ReentrantLock1 {
    synchronized void m1(){
        for (int i = 0; i<10; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if (i == 2)m2();
        }
    }
    synchronized void m2(){
        System.out.println("m2......");
    }

    public static void main(String[] args) {
        T01_ReentrantLock1 r1 = new T01_ReentrantLock1();
        new Thread(r1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r1::m2).start();
    }
}
