package com.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/16 19:55
 * 享元工厂类，用于返回被缓存的享元对象
 */
public class FlyweightFactory {

    private HashMap<String, Object> cachePool = new HashMap<>(16);

    private FlyweightFactory() {
    }

    public AbstractFlyweight getObject(String key){
        if (!cachePool.containsKey(key)) {
            ConcreteFlyweight instance = ConcreteFlyweight.getInstance(key);
            cachePool.put(key,instance);
        }
        return (AbstractFlyweight) cachePool.get(key);
    }

    enum FactoryEnum {
        /**
         * 缓存工厂
         */
        INSTANCE;
        private static final FlyweightFactory FLYWEIGHT_FACTORY = new FlyweightFactory();

        private FlyweightFactory getInstance() {
            return FLYWEIGHT_FACTORY;
        }
    }

    public static FlyweightFactory getInstance() {
        return FactoryEnum.INSTANCE.getInstance();
    }

}
