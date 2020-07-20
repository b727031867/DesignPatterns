package com.designpatterns.adapter.objects;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:09
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int method5V() {
        //这里实现适配逻辑，例如220V电压转成5V
        return adaptee.specificMethod()/44;
    }

    @Override
    public int method10V() {
        //这里实现适配逻辑，例如220V电压转成5V
        return adaptee.specificMethod()/22;
    }
}
