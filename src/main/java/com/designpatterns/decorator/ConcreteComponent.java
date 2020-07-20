package com.designpatterns.decorator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/8 21:11
 */
public class ConcreteComponent extends AbstractComponent {

    @Override
    public void businessMethod() {
        System.out.println("对象默认的实现方法！");
    }
}
