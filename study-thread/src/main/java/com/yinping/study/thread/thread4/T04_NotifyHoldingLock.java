package com.yinping.study.thread.thread4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <h3>study</h3>
 * <p></p>
 *曾经的面试题
 * 实现一个容器，提供两个方法，add，size
 * 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数达到五个的时候，线程2给出提示并结束
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.thread.thread4
 * @date : 2020-04-08 19:45
 **/
public class T04_NotifyHoldingLock {
    List lists = new ArrayList();
    public void add(Object o){lists.add(o);}
    public int size(){return lists.size();}

    public static void main(String[] args) {
        T04_NotifyHoldingLock t = new T04_NotifyHoldingLock();
        final Object lock = new Object();
        new Thread(()->{
            synchronized (lock){
                System.out.println("t2 on");
                if (t.size() != 5){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2 end");
                lock.notify();
            }
        },"t2").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            System.out.println("t1 on");
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    t.add(new Object());
                    System.out.println("add"+i);
                    if (t.size() == 5){
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1").start();
    }
}
