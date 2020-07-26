package com.designpatterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:17
 */
public class ProxyFactory {
    private Object object;

    /**
     * 初始化被代理对象的代理工厂
     * @param object 被代理的对象
     */
    public ProxyFactory(Object object){
        this.object = object;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(), this.object.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK动态代理开始");
            //通过反射调用该接口的实现方法
            Object returnValue = method.invoke(object, args);
            System.out.println("JDK动态代理结束");
            return returnValue;
        });
    }

}
