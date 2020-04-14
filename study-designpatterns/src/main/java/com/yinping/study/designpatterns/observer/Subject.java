package com.yinping.study.designpatterns.observer;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.observer
 * @date : 2020-04-14 21:17
 **/
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObservers();

    public void operation();
}
