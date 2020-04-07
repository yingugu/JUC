package com.yinping.study.thread.Thread1;/**
 * <h3>study</h3>
 * <p>单利模式</p>
 *
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @author : 42915
 * @date : 2020-04-07 20:17
 **/

/**
 * <h3>study</h3>
 * <p> 饿汉式</p>
 * @PACKAGE_NAME : com.yinping.study.thread.Thread1
 * @author : 42915
 * @date : 2020-04-07 20:17
 **/
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    private Mgr01(){ }
    public static Mgr01 getInstance(){return INSTANCE;}
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1==m2);
    }
}
