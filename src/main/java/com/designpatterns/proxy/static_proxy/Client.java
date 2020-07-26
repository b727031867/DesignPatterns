package com.designpatterns.proxy.static_proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 8:23
 * 静态代理模式
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        Business business = new SpecificBusiness();
        //创建代理对象
        Business proxyBusiness = new BusinessProxy(business);
        //通过代理对象执行被代理对象的方法
        proxyBusiness.doBusiness();
    }
}
