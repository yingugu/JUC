package com.yinping.study.thread.thread4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
public class T03_WithOutVolatile {
//    volatile List lists = new ArrayList();
    volatile List lists = Collections.synchronizedList(new LinkedList<>());
    public void add(Object o){lists.add(o);}
    public int size(){return lists.size();}

    public static void main(String[] args) {
        T03_WithOutVolatile t = new T03_WithOutVolatile();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                t.add(new Object());
                System.out.println("add "+i);
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();
        new Thread(()->{
            while (true){
                if (t.size() == 5){
                    break;
                }
            }
            System.out.println("t2 end");
        },"t2").start();
    }
}
