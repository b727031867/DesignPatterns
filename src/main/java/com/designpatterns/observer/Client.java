package com.designpatterns.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/4 19:00
 * 观察者模式
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject("状态1","目标名称1");
        ConcreteSubject concreteSubject2 = new ConcreteSubject("状态2","目标2");
        SpecificObserver specificObserver = new SpecificObserver(concreteSubject);
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        concreteSubject.subscribe(specificObserver);
        concreteSubject.subscribe(concreteObserver);
        specificObserver.modifyStatus("SpecificObserver修改");
        concreteObserver.modifyStatus("ConcreteObserver修改");
        concreteSubject.unsubscribe(concreteObserver);
        //第二次修改应该不输出内容，因为只有它本身
        specificObserver.modifyStatus("第二次修改");
        concreteSubject.subscribe(concreteObserver);
        log.info("==================具体观察者刷新全体观察者状态开始==================");
        concreteObserver.refreshForAll();
        log.info("==================具体观察者刷新全体观察者状态结束==================");
        //切换观察的目标
        concreteObserver.changeSubject(concreteSubject2);
        log.info("最终被ConcreteObserver观察目标的内部状态:{}",concreteObserver.getSubjectStatus());

    }
}
