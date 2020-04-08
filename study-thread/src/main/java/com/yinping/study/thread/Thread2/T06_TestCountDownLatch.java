package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 10:31
 * @since 0.1.0
 **/

import java.util.concurrent.CountDownLatch;

/**
 * <h3>study</h3>
 * <p>countdownlatch</p>
 * @author : yinping
 * @date : 2020-04-08 10:31
 **/
public class T06_TestCountDownLatch {
    private static void usingCountDownLatch(){
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                int result = 0;
                for (int j = 0; j < 10000; j++) result += j;
                latch.countDown();
            });
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    public static void usingJoin() {
    }
}
