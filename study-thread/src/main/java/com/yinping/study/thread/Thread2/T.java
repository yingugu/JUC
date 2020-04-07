package com.yinping.study.thread.Thread2;/**
 * <h3>study</h3>
 * <p>volatile不能保证原子性</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 20:56
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>study</h3>
 * <p>volatile不能保证原子性</p>
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 20:56
 **/
public class T {
   /* volatile */int count = 0;
    synchronized void m(){
        for (int i = 0;i<10000;i++)count++;
    }

    public static void main(String[] args) {
        T t = new T();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0;i<10;i++){threads.add(new Thread(t::m,"thread-"+i));}
        threads.forEach((o)->o.start());
        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}
