package com.designpatterns.adapter.classes;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:10
 * 类适配器模式：与对象适配模式的差别为继承（实现）关系与关联（聚合）关系、客户端使用时，无需Set对应的被适配者到
 */
public interface Target {

    /**
     * 客户端需要5V
     * @return 客户端需要使用的方法返回值
     */
    int method5V();

    /**
     * 客户端需要10V
     * @return 客户端需要使用的方法返回值
     */
    int method10V();
}
