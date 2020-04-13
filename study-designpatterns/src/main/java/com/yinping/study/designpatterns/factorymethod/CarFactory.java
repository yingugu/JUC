package com.yinping.study.designpatterns.factorymethod;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.factorymethod
 * @date : 2020-04-13 20:27
 **/
public class CarFactory {
    /*public Car createCar(){
        return new Car();
    }*/
    public Moveable createCar(){
        return new Car();
    }
}
