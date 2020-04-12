package com.yinping.study.tank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudyTankApplicationTests {

   /* @Test
    void contextLoads() {
        try {
            *//*BufferedImage image = ImageIO.read(new File("D:/图片/testpic.jpg"));
            assertNotNull(image);*//*
            BufferedImage images = ImageIO.read(StudyTankApplicationTests.class.getClassLoader().getResourceAsStream("static/images/tankL.gif"));
            assertNotNull(images);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    @Test
    void propertiesTest(){
       PropertyMgr p = new PropertyMgr();
        Object initTankCount = p.get("initTankCount");
        assertNotNull(initTankCount);
    }

}
