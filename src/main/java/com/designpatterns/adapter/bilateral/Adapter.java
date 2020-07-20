package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:09
 */
public class Adapter implements Target,Adaptee {

    private Adaptee adaptee;
    private Target target;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public Adapter(Target target){
        this.target = target;
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

    @Override
    public int specificMethod() {
        // 这里相当于旧接口调用新接口，比如已有的接口为220V 新接口为15V
        // 那么双向适配不仅仅能在编写新接口的时候调用旧接口
        // 也能在旧接口上调用新接口
        return target.method10V() + target.method5V();
    }
}
