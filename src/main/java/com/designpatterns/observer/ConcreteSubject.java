package com.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/4 20:56
 */
@Slf4j
public class ConcreteSubject extends BaseSubject {
    private String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public ConcreteSubject(String status,String name) {
        super.setName(name);
        this.status = status;
    }

    @Override
    public void updateStatus(String status,Observer observer) {
        setStatus(status);
        notifyObserver(observer);
    }

    @Override
    public String getSubjectStatus() {
        return getStatus();
    }
}
