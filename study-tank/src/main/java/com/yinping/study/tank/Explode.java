package com.yinping.study.tank;

import java.awt.*;

/**
 * <h3>study</h3>
 * <p>子弹</p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-12 12:05
 **/
public class Explode {
    public static int WIDTH = ResourceMgr.explodes[0].getWidth(), HEIGHT = ResourceMgr.explodes[0].getHeight();

    private boolean living = true;

    private int x, y;
    TankFrame tf = null;

    private int step = 0;

    public Explode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
        //new Audio("static/images/explode.wav").start();
       //new Thread(()->new Audio("static/images/explode.wav").play()).start();

    }

    public void paint(Graphics g) {

        g.drawImage(ResourceMgr.explodes[step++],x,y,null);
        if (step >= ResourceMgr.explodes.length)tf.explodes.remove(this);


    }
}
