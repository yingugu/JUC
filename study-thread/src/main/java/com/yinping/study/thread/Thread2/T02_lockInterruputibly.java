package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 10:13
 * @since 0.1.0
 **/

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>study</h3>
 * <p></p>
 * @author : yinping
 * @date : 2020-04-08 10:13
 **/
public class T02_lockInterruputibly {
    Lock lock = new ReentrantLock();
    void m1(){

        try {
            lock.lockInterruptibly();
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    void m2(){
        try {
            lock.lockInterruptibly();
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{lock.unlock();}

    }

    public static void main(String[] args) {
        T02_lockInterruputibly t = new T02_lockInterruputibly();
       /* new Thread(t::m1,"t1").start();
        new Thread(t::m2,"t2").start();*/

        Thread t1 = new Thread(()->{
            try {
                t.lock.lockInterruptibly();
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                System.out.println("m2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                t.lock.unlock();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                t.lock.lockInterruptibly();
                System.out.println("m2");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("m2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{t.lock.unlock();}
        });
        t1.start();
        t2.start();
        t2.interrupt();





    }
}
