package com.yinping.study.designpatterns.abstractfactory;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.abstractfactory
 * @date : 2020-04-13 20:54
 **/
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon creatWeapon() {
        return new MagicStick();
    }
}
