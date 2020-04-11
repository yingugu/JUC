package com.yinping.study.thread.thread4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
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
public class T05_CountDownLatch {
    List lists = new ArrayList();
    public void add(Object o){lists.add(o);}
    public int size(){return lists.size();}

    public static void main(String[] args) {
        T05_CountDownLatch t = new T05_CountDownLatch();
        CountDownLatch latch = new CountDownLatch(1);
        new Thread(()->{
            System.out.println("t2 on");
            if (t.size() != 5){
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 off");
            }
        },"t2").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            System.out.println("t1 on");
            for (int i = 0; i < 10; i++) {
                t.add(new Object());
                System.out.println("add"+i);
                if (t.size() == 5){
                    latch.countDown();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//如果不想用这个阻塞一秒，可以用两个countdown，lockSupport也是一样
            }
        },"t1").start();
    }
}
