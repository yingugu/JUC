package com.yinping.study.tank;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-13 19:33
 **/
public class FourDirFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bX = t.x + (Tank.WIDTH - Bullet.WIDTH) / 2;
        int bY = t.y + (Tank.HEIGHT - Bullet.HEIGHT) / 2;
        Dir[] dirs = Dir.values();
        for (Dir dir : dirs) {
            new Bullet(bX, bY, t.getDir(), t.getGroup(), t.tf);
        }

    }
}

