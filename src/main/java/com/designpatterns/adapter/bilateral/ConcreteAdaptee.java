package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/1 22:35
 * 适配者的实现方法（当前接口的实现类）
 */
public class ConcreteAdaptee implements Adaptee {

    @Override
    public int specificMethod() {
        return 220;
    }
}
