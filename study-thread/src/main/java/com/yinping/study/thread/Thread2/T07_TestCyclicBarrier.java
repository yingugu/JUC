package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 10:41
 * @since 0.1.0
 **/

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <h3>study</h3>
 * <p>CyclicBarrier</p>
 * @author : yinping
 * @date : 2020-04-08 10:41
 **/
public class T07_TestCyclicBarrier {
    public static void main(String[] args) {
//        CyclicBarrier barrier = new CyclicBarrier(20);
        //CyclicBarrier barrier = new CyclicBarrier(20,()-> System.out.println("gogogog"));//同下面方法
        CyclicBarrier barrier = new CyclicBarrier(20, new Runnable() {
            @Override
            public void run() {
                System.out.println("gogogo");
            }
        });//满第一个参数后，调用第二个参数,这种是更加优雅的写法
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    barrier.await();//跑满之前一直等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
