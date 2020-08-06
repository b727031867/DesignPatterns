package com.designpatterns.memorandum;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/6 19:50
 * 备忘录模式
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Origin origin1 = new Origin("白色", -1);
        Origin origin2 = new Origin("黑色", -10);

        caretaker.saveOperate(origin1, origin1.storeMemento());
        origin1.modify("666", 123);
        log.info("一执行修改操作，结果为：{}", origin1.toString());
        Origin.MemorandumBook memorandumBook1 = caretaker.undoLastOperate(origin1);
        origin1.modify(memorandumBook1.getText(),memorandumBook1.getStatus());
        log.info("一执行撤销操作，结果为：{}", origin1.toString());
        //执行保存
        caretaker.saveOperate(origin2, origin2.storeMemento());
        //执行修改
        origin2.modify("78", 36);
        log.info("二执行修改操作1，结果为：{}", origin2.toString());
        //执行保存
        caretaker.saveOperate(origin2, origin2.storeMemento());
        //执行修改
        origin2.modify("444", 78);
        log.info("二执行修改操作2，结果为：{}", origin2.toString());
        //执行撤销
        Origin.MemorandumBook memorandumBook2 = caretaker.undoLastOperate(origin2);
        origin2.modify(memorandumBook2.getText(),memorandumBook2.getStatus());
        log.info("二执行撤销操作2，结果为：{}", origin2.toString());
        //执行撤销
        Origin.MemorandumBook memorandumBook3 = caretaker.undoLastOperate(origin2);
        origin2.modify(memorandumBook3.getText(),memorandumBook3.getStatus());
        log.info("二执行撤销操作1，结果为：{}", origin2.toString());
    }
}
