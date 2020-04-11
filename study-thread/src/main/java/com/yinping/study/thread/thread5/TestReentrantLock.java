package com.yinping.study.thread.thread5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.thread.thread5
 * @date : 2020-04-08 21:50
 **/
public class TestReentrantLock {
    private static  volatile int i = 0;

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        i++;
        lock.unlock();
    }
}
