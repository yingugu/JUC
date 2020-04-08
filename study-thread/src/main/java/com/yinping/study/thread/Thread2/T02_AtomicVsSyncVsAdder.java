package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 09:19
 * @since 0.1.0
 **/

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * <h3>study</h3>
 * <p>比较</p>
 * @author : yinping
 * @date : 2020-04-08 09:19
 **/
public class T02_AtomicVsSyncVsAdder {
    static long count2 = 0L;
    static AtomicLong count1 = new AtomicLong(0L);
    static LongAdder count3 = new LongAdder();

    public static void main(String[] args) throws Exception{
        Thread[] threads = new Thread[1000];
        for (int i = 0; i <threads.length; i++){
            threads[i] = new Thread(()->{
                for (int k = 0; k<100000; k++)count1.incrementAndGet();
            });
        }
        long start = System.currentTimeMillis();
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
        long end = System.currentTimeMillis();
        System.out.println("Atomic: " + count1.get() + " time" + (end - start));
        Object lock = new Object();
        for (int i = 0; i<threads.length; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 100000; k++)
                        synchronized (lock){
                        count2++;
                        }
                }
            });
        }
        start = System.currentTimeMillis();
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
        end = System.currentTimeMillis();
        System.out.println("sync: " + count2 + " time" + (end - start));
    }
}
