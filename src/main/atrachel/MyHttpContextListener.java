package main.atrachel;

/**
 * Created by hd48552 on 2018/6/2.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class MyHttpContextListener implements  ServletContextListener,ServletRequestListener,HttpSessionListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
            System.out.println("--contextInitialized");
        System.out.println("--context:"+servletContextEvent.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("--contextDestroyed");

    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("--requestDestroyed");

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("--requestInitialized");

    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("--sessionCreated");
        System.out.println("--session:"+httpSessionEvent.getSession());;

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("--sessionDestroyed");

    }
}
