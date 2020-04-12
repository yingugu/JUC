package com.yinping.study.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-11 17:34
 **/
public class Main {
    public static void main(String[] args) {
       /* Frame f =new Frame();
        f.setSize(800,600);//设定尺寸
        f.setResizable(false);//是否可以改变大小
        f.setTitle("tank war");
        f.setVisible(true);//是否显示

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //super.windowClosing(e);
            }
        });*/
       TankFrame tf = new TankFrame();

       int iniTankCount = Integer.parseInt((String)PropertyMgr.get("iniTankCount"));
        /*PropertiesUtil propertiesUtil = new PropertiesUtil();
        int iniTankCount = Integer.parseInt((String) propertiesUtil.getInitTankCount());*/

       //初始化敌方坦克
        for (int i = 0; i < iniTankCount; i++) {
             tf.tanks.add(new Tank(50+i*80,200,Dir.DOWN,Group.BAD, tf));
        }
       while(true){
           try {
               Thread.sleep(50);
               tf.repaint();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }


    }
}
