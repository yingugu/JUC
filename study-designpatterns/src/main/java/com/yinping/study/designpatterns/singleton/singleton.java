package com.yinping.study.designpatterns.singleton;

/**
 * @program: study
 * @package_name com.yinping.study.designpatterns.singleton
 * @description: 枚举，最完美的单例
 * 可以防止反序列化、解决了线程同步,因为枚举类没有构造方法，所以无法构造对象，返回的只能是一个值，所以
 * 完美的单例只有这一种,枚举在反编译的时候是一个abstract方法，抽象类无法new出实例
 * @author: yinping
 * @create: 2020-04-13 11:06
 **/
public enum singleton {
    INSTANCE;
}
