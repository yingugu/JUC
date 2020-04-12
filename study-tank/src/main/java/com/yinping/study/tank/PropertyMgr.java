package com.yinping.study.tank;

import java.io.IOException;
import java.util.Properties;

/**
 * <h3>study</h3>
 * <p></p>
 *
 * @author : 42915
 * @PACKAGE_NAME : com.yinping.study.tank
 * @date : 2020-04-12 22:07
 **/
public class PropertyMgr {
    static Properties props = null;
    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config/config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object get(String key){
        if (props == null){
            return null;
        }
        return props.get(key);
    }
}
