package com.yinping.study.designpatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.observer
 * @date : 2020-04-14 21:18
 **/
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {

        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {

        Enumeration<Observer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }


}
