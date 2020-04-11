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
 * @date : 2020-04-11 17:44
 **/
public class TankFrame extends Frame {

    int x = 200,y = 200;
    public TankFrame(){
        setSize(800,600);//设定尺寸
        setResizable(false);//是否可以改变大小
        setTitle("tank war");
        setVisible(true);//是否显示

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //super.windowClosing(e);
            }
        });
    }
    @Override
    public void paint(Graphics g){
        System.out.println("m");
        g.fillRect(x,y,50,50);
        x += 10;
        y += 10;
    }
}
