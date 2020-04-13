package com.yinping.study.designpatterns.factorymethod;

/**
 * <h3>study</h3>
 * <p>简单工厂</p>
 *可扩展性不好，当有新的增加的时候，要修改
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.factorymethod
 * @date : 2020-04-13 20:25
 **/
public class SimpleVefactory {
    public Car createCar(){
        return new Car();
    }
    /*...*/
}
