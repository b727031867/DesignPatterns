package com.designpatterns.memorandum;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/6 20:00
 */
@Slf4j
public class Caretaker {
    private ConcurrentHashMap<Object,Stack<Origin.MemorandumBook>> mementoMap = new ConcurrentHashMap<>();

    public void saveOperate(Object key,Origin.MemorandumBook value){
        if(mementoMap.get(key) != null){
            mementoMap.get(key).push(value);
        }else {
            Stack<Origin.MemorandumBook> stack = new Stack<>();
            stack.push(value);
            mementoMap.put(key,stack);
        }
    }

    public Origin.MemorandumBook undoLastOperate(Object key){
        if(!mementoMap.get(key).isEmpty()){
            return mementoMap.get(key).pop();
        }else {
            log.warn("已经没有可以回退的步骤了，将移除本对象的操作栈");
            mementoMap.remove(key);
            return null;
        }
    }
}
