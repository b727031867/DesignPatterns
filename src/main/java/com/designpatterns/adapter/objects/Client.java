package com.designpatterns.adapter.objects;

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
        target = new Adapter(new Adaptee());
        //调用的是适配后的5V方法
        System.out.println("当前需要5V：" + target.method5V());
        //调用的是适配后的10V方法
        System.out.println("当前需要10V：" + target.method10V());
    }
}
