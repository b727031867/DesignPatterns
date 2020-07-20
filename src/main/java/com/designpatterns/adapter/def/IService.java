package com.designpatterns.adapter.def;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:10
 * 默认适配器模式，抽象类空实现接口方法，以便于子类能够有选择的实现接口的方法
 */
public interface IService {

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
