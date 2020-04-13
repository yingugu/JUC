package com.yinping.study.designpatterns.singleton;

/**
 * @author : yinping
 * @package_name com.yinping.study.designpatterns.singleton
 * <h3>study</h3>
 * <p>双重检查锁，懒汉式</p>
 * @date : 2020-04-13 10:58
 **/
public class dcl {
    private static volatile dcl INSTANCE;//防止指令重排序

    private dcl() {
    }

    private static dcl getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (dcl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new dcl();
                }
            }
        }
        return INSTANCE;
    }
}
