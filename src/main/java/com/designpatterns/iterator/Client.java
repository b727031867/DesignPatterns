package com.designpatterns.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/3 19:15
 * 迭代器模式
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("666");
        myList.add("777");
        myList.add("888");
        Iterator<Object> iterator = myList.iterator();
        while (iterator.hasNext()){
            String str = (String)iterator.next();
            log.info("正序遍历:{}" , str);
        }
        while (iterator.hasPrevious()){
            String str = (String)iterator.previous();
            log.info("倒序遍历:{}" , str);
        }
    }
}
