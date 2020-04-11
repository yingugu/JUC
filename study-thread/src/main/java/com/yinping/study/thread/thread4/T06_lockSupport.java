package com.yinping.study.thread.thread4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

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
public class T06_lockSupport {
    List lists = new ArrayList();
    public void add(Object o){lists.add(o);}
    public int size(){return lists.size();}
    static Thread t1 = null,t2 = null;
    public static void main(String[] args) {
        T06_lockSupport t = new T06_lockSupport();


       t2 = new Thread(()->{
            if(t.size() != 5){
                LockSupport.park();
            }
            System.out.println("t2 end");
            LockSupport.unpark(t1);
        },"t2");
       t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                t.add(new Object());
                if (t.size() == 5){
                    LockSupport.unpark(t2);
                    LockSupport.park();
                }

            }
        },"t1");
        t2.start();
        t1.start();

    }
}
