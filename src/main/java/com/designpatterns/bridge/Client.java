package com.designpatterns.bridge;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/9 23:01
 */
public class Client {
    public static void main(String[] args) {
        IService iService = new ServiceImpl();
        AbstractModule abstractModule = new SpecificModule(iService);
        abstractModule.abstractMethod();
        abstractModule = new OrtherMoudule(iService);
        abstractModule.abstractMethod();
    }
}
