package com.designpatterns.intermediary;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/5 16:36
 */
public abstract class BaseIntermediary {

    /**
     * 使用中介者（转发调用）
     * 根据不同的同事，执行不同的逻辑
     * @param baseColleague 被调用的同事类
     */
    abstract void interactiveBehavior(BaseColleague baseColleague);
}
