package com.designpatterns.observer;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/4 18:59
 */
public interface Observer {
    /**
     * 观察者更新自身的信息
     * @param observer 被通知更新的观察者
     */
    void update(Observer observer);

    /**
     * 修改当前观察者的目标
     * @param subject 被观察的目标
     */
    void changeSubject(BaseSubject subject);
}
