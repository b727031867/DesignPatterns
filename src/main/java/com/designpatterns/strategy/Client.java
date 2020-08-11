package com.designpatterns.strategy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 8:37
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        SpecificStrategyOne one = new SpecificStrategyOne();
        SpecificStrategyTwo two = new SpecificStrategyTwo();
        Context context = new Context(one);
        context.calculate();
        context.setStrategy(two);
        context.calculate();
    }
}
