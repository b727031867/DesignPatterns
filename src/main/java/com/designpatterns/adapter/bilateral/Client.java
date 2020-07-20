package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:18
 */
public class Client {
    public static void main(String[] args) {
        //客户端需要的接口
        Target target;
        //让原220V的方法适配到5V
        target = new Adapter(new ConcreteAdaptee());
        //调用的是适配后的5V方法
        System.out.println("当前需要5V：" + target.method5V());
        //调用的是适配后的10V方法
        System.out.println("当前需要10V：" + target.method10V());
        //服务端需要客户端的接口
        Adaptee adaptee;
        //让原220V的方法适配到15V
        adaptee = new Adapter(new ConcreteTarget());
        //将220V电压适配成15V（通过调用目标类中两种新接口的方法，相加得到）
        System.out.println("当前需要15V：" + adaptee.specificMethod());
    }
}
