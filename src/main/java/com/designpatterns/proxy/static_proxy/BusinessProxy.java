package com.designpatterns.proxy.static_proxy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/26 11:09
 */
public class BusinessProxy implements Business {
    private Business specificBusiness = null;

    public BusinessProxy(Business business){
        this.specificBusiness = business;
    }

    @Override
    public void doBusiness() {
        //可以在代理之前处理一些东西
        specificBusiness.doBusiness();
        //可以在代理之后处理一些东西
    }
}
