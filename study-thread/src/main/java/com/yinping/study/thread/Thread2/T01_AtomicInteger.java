package com.yinping.study.thread.Thread2;/**
 * <h3>study</h3>
 * <p>atomicinteger</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 21:22
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <h3>study</h3>
 * <p>atomicinteger</p>
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 21:22
 **/
public class T01_AtomicInteger {
    AtomicInteger count = new AtomicInteger(0);
    void m(){
        for (int i = 0;i < 10000;i++){
            count.incrementAndGet();//相当于count++
        }
    }

    public static void main(String[] args) {
        T01_AtomicInteger t = new T01_AtomicInteger();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            threads.add(new Thread(t::m,"thread-"+i));
        }
        threads.forEach((o)->o.start());
        threads.forEach((o)-> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);


    }
}
