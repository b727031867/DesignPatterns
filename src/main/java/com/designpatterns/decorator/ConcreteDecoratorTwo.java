package com.designpatterns.decorator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/8 21:24
 */
public class ConcreteDecoratorTwo extends Decorator {
    public ConcreteDecoratorTwo(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void businessMethod() {
        super.businessMethod();
        addBusinessMethod();
    }

    private void addBusinessMethod(){
        System.out.println("新增的业务方法2");
    }
}
