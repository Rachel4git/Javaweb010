//package main.atrachel;
//
//import javax.servlet.http.HttpSessionActivationListener;
//import javax.servlet.http.HttpSessionBindingEvent;
//import javax.servlet.http.HttpSessionBindingListener;
//import javax.servlet.http.HttpSessionEvent;
//import java.io.Serializable;
//
///**
// * Created by hd48552 on 2018/6/2.
// */
//public class MySessionBindingListener  implements HttpSessionBindingListener ,HttpSessionActivationListener,Serializable{
//    @Override
//    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
//        System.out.println("sessionWillPassivate");
//        System.out.println("session: " +httpSessionEvent.getSession());
//    }
//
//    @Override
//    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
//        System.out.println("sessionDidActivate");
//    }
//
//    @Override
//    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
//        System.out.println("valueBound");
//        System.out.println("session: "+httpSessionBindingEvent.getSession()+";session name: "+httpSessionBindingEvent.getName()+"session value: "+httpSessionBindingEvent.getValue());
//    }
//
//    @Override
//    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
//        System.out.println("valueUnbound");
//    }
//}
//
