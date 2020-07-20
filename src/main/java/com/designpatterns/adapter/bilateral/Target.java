package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:10
 * 对象适配器模式
 * 目标抽象类：表示客户端需要使用的接口，该接口又想要调用已有的接口，但是直接调用存在不适用的问题（例如电压要求5V，当前为220V的接口）
 * 所以使用适配器模式，通过调用适配器类的具体实现，来完成客户端需要的接口功能
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
