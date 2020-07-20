package com.designpatterns.flyweight;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/16 19:39
 */
public abstract class AbstractFlyweight {

    /**
     * 分离出共享对象的外部状态
     * 传入不同外部状态区分不同享元对象
     * @param extrinsicState 外部状态
     */
    public abstract void operate(String extrinsicState);

}
