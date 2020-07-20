package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:49
 */
public class Client {
    public static void main(String[] args) {
        AbstractFacade abstractFacade1 = new ConcreteFacadeOne();
        AbstractFacade abstractFacade2 = new ConcreteFacadeTwo();
        abstractFacade1.doSomeThings();
        abstractFacade2.doSomeThings();
    }
}
