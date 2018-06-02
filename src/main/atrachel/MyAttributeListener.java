package main.atrachel;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created by hd48552 on 2018/6/2.
 */
public class MyAttributeListener implements ServletContextAttributeListener,ServletRequestAttributeListener,HttpSessionAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("ServletContextAttributeEvent attributeAdded");
        System.out.println("attribute name :"+servletContextAttributeEvent.getName()+"; attribute value :"+servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("ServletContextAttributeEvent attributeRemoved");
        System.out.println("attribute name :"+servletContextAttributeEvent.getName()+"; attribute value :"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("ServletContextAttributeEvent attributeReplaced");
        System.out.println("attribute name :"+servletContextAttributeEvent.getName()+"; attribute value :"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("ServletRequestAttributeEvent attributeAdded");
        System.out.println("attribute name :"+servletRequestAttributeEvent.getName()+"; attribute value :"+servletRequestAttributeEvent.getValue());

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("ServletRequestAttributeEvent attributeRemoved");
        System.out.println("attribute name :"+servletRequestAttributeEvent.getName()+"; attribute value :"+servletRequestAttributeEvent.getValue());

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("ServletRequestAttributeEvent attributeReplaced");
        System.out.println("attribute name :"+servletRequestAttributeEvent.getName()+"; attribute value :"+servletRequestAttributeEvent.getValue());

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
