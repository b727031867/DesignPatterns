package com.designpatterns.decorator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/8 21:17
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void businessMethod(){
        super.businessMethod();
        addBusinessMethod();
    }

    private void addBusinessMethod(){
        System.out.println("通过装饰模式添加的方法1");
    }
}
