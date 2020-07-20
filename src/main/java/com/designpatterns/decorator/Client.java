package com.designpatterns.decorator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/8 21:21
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent abstractComponent = new ConcreteComponent();
        //第一次装饰
        AbstractComponent hasBeenDecorated = new ConcreteDecorator(abstractComponent);
        //第二次装饰
        hasBeenDecorated = new ConcreteDecoratorTwo(hasBeenDecorated);
        hasBeenDecorated.businessMethod();
    }
}
