package com.yinping.study.tank;

/**
 * @author : yinping
 * @package_name com.yinping.study.tank
 * <h3>study</h3>
 * <p>默认的开火，策略模式</p>
 * @date : 2020-04-13 17:20
 **/
//TODO:做成单例
public class DefaultFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {

        int bX = t.x + (Tank.WIDTH  - Bullet.WIDTH) /2;
        int bY = t.y + (Tank.HEIGHT - Bullet.HEIGHT )/2;
        new Bullet(bX, bY, t.getDir(), t.getGroup(), t.tf);
    }
}
