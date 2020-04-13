package com.yinping.study.designpatterns.abstractfactory;

import java.util.Vector;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.designpatterns.abstractfactory
 * @date : 2020-04-13 20:47
 **/
public abstract class AbstractFactory {

    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon creatWeapon();
}
