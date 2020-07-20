package com.designpatterns.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/19 10:08
 * 享元模式结合组合模式，通过享元模式缓存内部状态相同的对象，
 * 通过组合模式复合具有相同外部状态的享元对象，即外部享元对象持有具有这种外部状态的内部享元对象的列表
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        //获取内部共享状态的享元对象
        AbstractFlyweight red1 = flyweightFactory.getObject("red");
        AbstractFlyweight red2 = flyweightFactory.getObject("red");
        AbstractFlyweight black1 = flyweightFactory.getObject("black");
        AbstractFlyweight black2 = flyweightFactory.getObject("black");
        //创建不同的外部状态对象
        UnsharedConcreteFlyweight unsharedConcreteFlyweight1 = new UnsharedConcreteFlyweight();
        UnsharedConcreteFlyweight unsharedConcreteFlyweight2 = new UnsharedConcreteFlyweight();
        //在外部状态1上放置了两个不同颜色的享元对象
        unsharedConcreteFlyweight1.operate("外部状态1");
        unsharedConcreteFlyweight1.add(red1);
        unsharedConcreteFlyweight1.add(black1);
        unsharedConcreteFlyweight1.print();
        //在外部状态2上放置了两个不同颜色的享元对象
        unsharedConcreteFlyweight2.operate("外部状态2");
        unsharedConcreteFlyweight2.add(red2);
        unsharedConcreteFlyweight2.add(black2);
        unsharedConcreteFlyweight2.print();
        //查看两个不同的外部状态所用的内部状态对象是否是同一个对象
        log.info(String.valueOf(red1 == red2));
        log.info(String.valueOf(black1 == black2));

    }
}
