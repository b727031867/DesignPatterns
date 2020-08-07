package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/4 19:00
 */
public abstract class BaseSubject {
    private List<Observer> observers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    protected void subscribe(Observer observer) {
        observers.add(observer);
    }

    protected void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    /**
     * 具体目标(被观察者)的修改内部状态方法
     * @param status 被观察者内部的状态
     * @param observer 触发更新的观察者
     */
    public abstract void updateStatus(String status,Observer observer);

    /**
     * 获取具体目标的内部信息
     * @return 内部信息
     */
    public abstract String getSubjectStatus();

    /**
     * 排除某个观察者，不给其推送更新消息
     * @param exclude 被排除的观察者
     */
    protected void notifyObserver(Observer exclude){
        for (Observer observer : observers) {
            if(observer != exclude){
                observer.update(observer);
            }
        }
    }

    /**
     * 推送给所有观察者，包括触发推送的观察者
     */
    protected void notifyObserverAll(){
        for (Observer observer : observers) {
            observer.update(observer);
        }
    }
}
