package com.yinping.study.thread.Thread3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * <h3>study</h3>
 * <p>T13_TestLockSupport</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.thread.Thread3
 * @date : 2020-04-08 19:31
 **/
public class T13_TestLockSupport {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5){
                    LockSupport.park();
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after 8 seconds");

        LockSupport.unpark(t);
    }
}
