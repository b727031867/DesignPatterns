package com.designpatterns.proxy.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:17
 */
public class ProxyFactory implements MethodInterceptor {
    private Object object;

    /**
     * 初始化被代理对象的代理工厂
     *
     * @param object 被代理的对象
     */
    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(object.getClass());
        //设置回调函数，
        enhancer.setCallback(this);
        //创建代理对象并且返回
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("GBLib动态代理开始");
        Object returnVal = method.invoke(object, args);
        System.out.println("GBLib动态代理结束");
        return returnVal;
    }
}
