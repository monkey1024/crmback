package com.monkey1024.crmback.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashSet;

/**
 *  监听ServletContext的创建，构建存放token的List
 */
@WebListener
public class TokenServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        HashSet<String> tokenSet = new HashSet<>();
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("tokenSet",tokenSet);
    }
}
