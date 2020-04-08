package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 09:52
 * @since 0.1.0
 **/

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>study</h3>
 * <p>reentrantlock</p>
 * @author : yinping
 * @date : 2020-04-08 09:52
 **/
public class T02_ReentrantLock2 {
    Lock lock = new ReentrantLock();
    void m1(){
        try {
            lock.lock();//相当于synchronized（this），一定手动解锁，卸载finally里面
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void m2(){
        try {
            lock.lock();
            System.out.println("m2......");
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        T02_ReentrantLock2 r1 = new T02_ReentrantLock2();
        new Thread(r1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r1::m2).start();
    }
}
