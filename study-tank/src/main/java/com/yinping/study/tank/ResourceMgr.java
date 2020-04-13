package com.yinping.study.tank;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-12 14:24
 **/
public class ResourceMgr {
    //TODO 可以将此类改成单例
    public static BufferedImage goodTankL,goodTankU,goodTankR,goodTankD;
    public static BufferedImage badTankL,badTankU,badTankR,badTankD;
    public static BufferedImage bulletL,bulletR,bulletD,bulletU;
    public static BufferedImage[] explodes = new BufferedImage[16];

    static{
        try {
            goodTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("static/images/GoodTank1.png"));
            goodTankL = ImageUtil.rotateImage(goodTankU, -90);
            goodTankR = ImageUtil.rotateImage(goodTankU, 90);
            goodTankD = ImageUtil.rotateImage(goodTankU, 180);

            badTankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("static/images/BadTank1.png"));
            badTankL = ImageUtil.rotateImage(badTankU, -90);
            badTankR = ImageUtil.rotateImage(badTankU, 90);
            badTankD = ImageUtil.rotateImage(badTankU, 180);

            bulletL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("static/images/bulletL.gif"));
            bulletR = ImageUtil.rotateImage(bulletL,180);
            bulletD = ImageUtil.rotateImage(bulletL,-90);
            bulletU = ImageUtil.rotateImage(bulletL,90);

            for (int i = 0; i < 16; i++) explodes[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("static/images/e"+(i+1)+".gif"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
