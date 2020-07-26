package com.designpatterns.proxy.cglib_proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:57
 * CGLib动态代理
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBusiness target = new ConcreteBusiness();
        ConcreteBusiness proxyInstance = (ConcreteBusiness)new ProxyFactory(target).getProxyInstance();
        proxyInstance.doBusiness();
    }
}
