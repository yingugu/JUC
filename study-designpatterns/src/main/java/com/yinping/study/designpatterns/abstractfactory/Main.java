package com.yinping.study.designpatterns.abstractfactory;

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
      /*  Car c = new Car();
        c.go();
        AK47 w = new AK47();
        w.shoot();
        Bread b = new Bread();
        b.printName();*/
        AbstractFactory f = new ModernFactory();
        Vehicle v = f.createVehicle();
        Food d = f.createFood();
        Weapon w = f.creatWeapon();
    }
}
