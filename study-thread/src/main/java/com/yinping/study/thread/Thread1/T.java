package com.yinping.study.thread.Thread1;/**
 * <h3>study</h3>
 * <p>多线程学习</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @author : 42915
 * @date : 2020-04-07 20:04
 **/

import java.util.concurrent.TimeUnit;

/**
 * <h3>study</h3>
 * <p>多线程学习</p>
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @author : 42915
 * @date : 2020-04-07 20:04
 **/
public class T {

    volatile boolean running = true;
    void m(){
        System.out.println("m start");
        while(running){

        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }


}
