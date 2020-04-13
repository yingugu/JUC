package com.yinping.study.designpatterns.abstractfactory;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.abstractfactory
 * @date : 2020-04-13 20:54
 **/
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon creatWeapon() {
        return new AK47();
    }
}
