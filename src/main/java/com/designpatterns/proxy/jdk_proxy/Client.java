package com.designpatterns.proxy.jdk_proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:17
 * JDK动态代理
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        Business concreteBusiness = new ConcreteBusiness();
        //通过JDK动态代理，使用被代理对象，创建其代理对象
        Business proxyInstance = (Business) new ProxyFactory(concreteBusiness).getProxyInstance();
        proxyInstance.doBusiness();
    }
}
