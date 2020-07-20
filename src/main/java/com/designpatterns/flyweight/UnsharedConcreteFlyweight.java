package com.designpatterns.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/16 21:59
 * 不共享的外部状态类
 */
@Slf4j
public class UnsharedConcreteFlyweight extends AbstractFlyweight {
    /**
     * 一系列内部状态不同或相同的内部享元类列表
     * 将具有相同外部状态的享元类
     */
    private List<AbstractFlyweight> abstractFlyweights = new ArrayList<>(16);

    @Override
    public void operate(String extrinsicState) {
        log.info("当前要创建的享元对象的外部属性为：{}",extrinsicState);
    }

    public void add(AbstractFlyweight abstractFlyweight){
        abstractFlyweights.add(abstractFlyweight);
    }

    public void remove(AbstractFlyweight abstractFlyweight){
        abstractFlyweights.remove(abstractFlyweight);
    }

    public void print(){
        log.info("=============================开始打印具有这种外部状态的享元对象=============================");
        for (AbstractFlyweight abstractFlyweight : abstractFlyweights) {
            ((ConcreteFlyweight)abstractFlyweight).print();
        }
        log.info("=============================结束打印具有这种外部状态的享元对象=============================");
    }
}
