package com.designpatterns.decorator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/8 21:14
 */
public class Decorator extends AbstractComponent {
    private AbstractComponent abstractComponent;

    public Decorator(AbstractComponent abstractComponent){
        this.abstractComponent =abstractComponent;
    }

    @Override
    public void businessMethod() {
        //调用组件基础的功能
        abstractComponent.businessMethod();
    }
}
