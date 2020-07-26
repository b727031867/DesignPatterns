package com.designpatterns.proxy.cglib_proxy;


/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:18
 * 没有实现任何接口的具体业务类
 */
public class ConcreteBusiness{
    public void doBusiness() {
        System.out.println("具体的业务实现方法");
    }
}
