package org.notsay.githubdemo.util;

import java.util.logging.Logger;

/**
 * @description:
 * @author: dsy
 * @date: 2022/4/8 14:46
 */
public class StringUtils {
    private static final Logger log = Logger.getLogger(StringUtils.class.getName());

    /**
     * 判断字符串是否是空或者null
     */
    public static Boolean isBlank(String param){
        if(param == null || "".equals(param)){
            return true;
        }
        return false;
    }

}