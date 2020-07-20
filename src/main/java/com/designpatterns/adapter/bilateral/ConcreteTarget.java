package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/1 22:34
 */
public class ConcreteTarget implements Target {

    @Override
    public int method5V() {
        return 5;
    }

    @Override
    public int method10V() {
        return 10;
    }
}
