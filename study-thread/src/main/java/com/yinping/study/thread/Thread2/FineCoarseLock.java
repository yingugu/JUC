package com.yinping.study.thread.Thread2;/**
 * <h3>study</h3>
 * <p>锁优化</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 21:05
 **/

import java.util.concurrent.TimeUnit;

/**
 * <h3>study</h3>
 * <p>锁优化</p>
 * synchronized来说锁的力度尽量小一些
 * @PACKAGE_NAME : com.yinping.study.thread.Thread2
 * @author : 42915
 * @date : 2020-04-07 21:05
 **/
public class FineCoarseLock {
    int count = 0;
    synchronized void m1(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
