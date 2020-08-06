package com.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/4 20:50
 */
@Slf4j
public class SpecificObserver implements Observer {
    private BaseSubject baseSubject;

    public SpecificObserver(BaseSubject baseSubject) {
        this.baseSubject = baseSubject;
    }


    @Override
    public void update(Observer observer) {
        log.info("{}更新了它观察的目标信息，目标的内部状态修改为：{}", this.toString(), baseSubject.getSubjectStatus());
    }

    @Override
    public void changeSubject(BaseSubject subject) {
        this.baseSubject.unsubscribe(this);
        this.baseSubject = subject;
        subject.subscribe(this);
    }

    public void modifyStatus(String status) {
        baseSubject.updateStatus(status,this);
    }
}
