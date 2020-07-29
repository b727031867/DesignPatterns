package com.designpatterns.template;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/29 10:32
 * 模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        BaseTemplate baseTemplate1 = new SpecificBussinessOne();
        baseTemplate1.template();
        BaseTemplate baseTemplate2 = new SpecificBussinessTwo();
        baseTemplate2.template();
    }
}
