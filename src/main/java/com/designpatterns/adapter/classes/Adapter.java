package com.designpatterns.adapter.classes;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:09
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public int method5V() {
        //这里实现适配逻辑，例如220V电压转成5V
        return super.specificMethod()/44;
    }

    @Override
    public int method10V() {
        //这里实现适配逻辑，例如220V电压转成5V
        return super.specificMethod()/22;
    }
}
