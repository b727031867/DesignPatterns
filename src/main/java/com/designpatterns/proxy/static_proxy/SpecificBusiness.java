package com.designpatterns.proxy.static_proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:10
 */
public class SpecificBusiness implements Business {
    @Override
    public void doBusiness() {
        System.out.println("具体业务方法的实现类");
    }
}
