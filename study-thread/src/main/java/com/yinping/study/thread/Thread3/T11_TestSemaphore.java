package com.yinping.study.thread.Thread3;/**
 * @package_name com.yinping.study.thread.Thread3
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 14:46
 * @since 0.1.0
 **/

import java.util.concurrent.Semaphore;

/**
 * <h3>study</h3>
 * <p>semaphore</p>
 * @author : yinping
 * @date : 2020-04-08 14:46
 **/
public class  T11_TestSemaphore {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);//还可以加一个参数fair（true/false）公平非公平，还是要看内部的队列，实际并不是完全准，都是用AQS
        //信号量，上面是允许一个线程同时执行
        new Thread(()->{
            try {
                s.acquire();//阻塞方法，拿到信号的时候，将s减一
                System.out.println("T1 running");
                Thread.sleep(200);
                System.out.println("T1 running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                s.release();//将通道让出来
            }
        }).start();
        new Thread(()->{

            try {
                s.acquire();
                System.out.println("T2 running");
                Thread.sleep(200);
                System.out.println("T2 running");
                s.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                s.release();//将通道让出来
            }

        }).start();
    }
}
