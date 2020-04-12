package com.yinping.study.tank;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;


/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-11 17:44
 **/
public class TankFrame extends Frame {

    /*int x = 200,y = 200;
    Dir dir = Dir.DOWN;
    private static final int SPEED = 10;//常量，不应该别别人改变*/
    Tank myTank = new Tank(200,400,Dir.DOWN, Group.GOOD,this);//面向对象中的封装

    List<Bullet> bullets = new ArrayList<>();
    List<Tank> tanks = new ArrayList<>();

    List<Explode> explodes = new ArrayList<>();

    //Bullet b = new Bullet(300,300,Dir.DOWN, this);

    static final int GAME_WIDTH = 800, GAME_HEIGHT = 600;
    public TankFrame(){
        setSize(800,600);//设定尺寸
        setResizable(false);//是否可以改变大小
        setTitle("tank war");
        setVisible(true);//是否显示
        this.addKeyListener(new MyKeyListner());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //super.windowClosing(e);
            }
        });
    }
    Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null){
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage, 0, 0, null);
    }

    @Override
    public void paint(Graphics g){
        //System.out.println("m");
        myTank.paint(g);

        /*for (Bullet b : bullets) {
            b.paint(g);
        }*///这里不能用迭代器，会导致迭代和list中不同，迭代器迭代过程中不允许其他地方操作集合
        for (int i = 0; i < bullets.size(); i++) {

            bullets.get(i).paint(g);
        }
        for (int i = 0; i < tanks.size(); i++) {
            tanks.get(i).paint(g);
        }

        for (int i = 0; i < explodes.size(); i++) {
            explodes.get(i).paint(g);
        }
        //碰撞检测
        for (int i = 0; i < bullets.size(); i++) {
            for (int j = 0; j < tanks.size(); j++) {

                bullets.get(i).collidWith(tanks.get(j));
            }
        }
        //e.paint(g);
        /*x += 10;
        y += 10;*/
    }
    class MyKeyListner extends KeyAdapter{
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
           // System.out.println(key);
            switch (key){
                case KeyEvent.VK_LEFT:

                   bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR= true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
                default:
                    break;
            }
            setMainTankDir();
            /*System.out.println("key pressed");
            super.keyPressed(e);*/
            /*x += 200;
            repaint();*/
        }

        @Override
        public void keyReleased(KeyEvent e) {

            int key = e.getKeyCode();
            // System.out.println(key);
            switch (key){
                case KeyEvent.VK_LEFT:

                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR= false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir() {
            if(!bL && !bU && !bR && !bD) myTank.setMoving(false);
            else {
                myTank.setMoving(true);

                if (bL) myTank.setDir(Dir.LEFT);
                if (bU) myTank.setDir(Dir.UP);
                if (bR) myTank.setDir(Dir.RIGHT);
                if (bD) myTank.setDir(Dir.DOWN);
            }



        }
    }
}
