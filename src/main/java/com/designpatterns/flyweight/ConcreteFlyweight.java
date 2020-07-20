package com.designpatterns.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/16 21:23
 * 具体享元类，通常由单例模式产生对象
 */
@Slf4j
public class ConcreteFlyweight extends AbstractFlyweight {

    private String intrinsicState;

    @Override
    public void operate(String extrinsicState) {
        log.info("享元对象外部变化的属性：{}",extrinsicState);
    }

    private ConcreteFlyweight(String intrinsicState){
        this.intrinsicState =intrinsicState;
        log.info("当前要创建的享元对象的内部属性为：{}",intrinsicState);
    }

    enum ConcreteFlyweightEnum {
        /**
         * 单例枚举
         */
        INSTANCE;

        private ConcreteFlyweight getInstance(String intrinsicState) {
            return new ConcreteFlyweight(intrinsicState);
        }
    }

    public void print(){
        log.info("当前具体享元对象的内部状态是：{}",intrinsicState);
    }

    /**
     * 创建某种具体内部状态的享元对象
     * @param intrinsicState 内部属性，例如黑棋与白棋的黑色与白色
     * @return 具体的享元类
     */
    public static ConcreteFlyweight getInstance(String intrinsicState) {
        return ConcreteFlyweightEnum.INSTANCE.getInstance(intrinsicState);
    }
}
