package com.yinping.study.designpatterns.observer;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.observer
 * @date : 2020-04-14 21:23
 **/
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("aaa");
        notifyObservers();
    }
}
