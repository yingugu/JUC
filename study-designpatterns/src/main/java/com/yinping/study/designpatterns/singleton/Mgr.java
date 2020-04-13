package com.yinping.study.designpatterns.singleton;

/**
 * @author : yinping
 * @package_name com.yinping.study.designpatterns.singleton
 * <h3>study</h3>
 * <p>完美写法的单例模式</p>
 * 由虚拟机保证线程安全，因为虚拟机加载一个类的时候只会加载一次
 * @date : 2020-04-13 15:04
 **/
public class Mgr {
    private Mgr(){}
    private static class MgrHolder {
        private final static Mgr INSTANCE = new Mgr();
    }

    public static Mgr getINSTANCE(){
        return MgrHolder.INSTANCE;
    }
}
