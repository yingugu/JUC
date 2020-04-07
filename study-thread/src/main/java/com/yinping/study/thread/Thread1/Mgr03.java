package com.yinping.study.thread.Thread1;/**
 * <h3>study</h3>
 * <p>懒汉式</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @author : 42915
 * @date : 2020-04-07 20:22
 **/

/**
 * <h3>study</h3>
 * <p>懒汉式</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @date : 2020-04-07 20:22
 **/
public class Mgr03 {
    private static volatile Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr03.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr03();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
        }
    }
}
