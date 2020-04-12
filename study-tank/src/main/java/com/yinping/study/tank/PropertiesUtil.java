package com.yinping.study.tank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.EventListener;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-12 23:12
 **/

//@PropertySource(value = { "config/config" })

public class PropertiesUtil {
    /*@Value("${initTankCount}")
    private String initTankCount;

    public String getInitTankCount() {
        return initTankCount;
    }

    public void setInitTankCount(String initTankCount) {
        this.initTankCount = initTankCount;
    }*/
    @Autowired
    private Environment ev;

}
