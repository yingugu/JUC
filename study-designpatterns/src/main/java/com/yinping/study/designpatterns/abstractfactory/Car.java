package com.yinping.study.designpatterns.abstractfactory;

import com.yinping.study.designpatterns.factorymethod.Moveable;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.factorymethod
 * @date : 2020-04-13 20:06
 **/
public class Car extends Vehicle {
    @Override
    public void go(){
        System.out.println("car go wuwuwuwuw....");
    }
}
