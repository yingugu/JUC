package com.yinping.study.designpatterns.factorymethod;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.factorymethod
 * @date : 2020-04-13 20:05
 **/
public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().createCar();
        m.go();
    }
}
