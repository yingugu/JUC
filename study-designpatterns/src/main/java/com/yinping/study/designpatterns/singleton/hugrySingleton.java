package com.yinping.study.designpatterns.singleton;

/**
 * @author : yinping
 * @package_name com.yinping.study.designpatterns.singleton
 * <h3>study</h3>
 * <p>饿汉式单例</p>
 * @date : 2020-04-13 11:04
 **/
public class hugrySingleton {
    private static hugrySingleton INSTANCE = new hugrySingleton();
    private hugrySingleton(){}
    public hugrySingleton getINSTANCE(){
        return INSTANCE;
    }
}
