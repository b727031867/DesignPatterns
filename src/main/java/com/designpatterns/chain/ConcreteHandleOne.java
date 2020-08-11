package com.designpatterns.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 12:48
 */
@Slf4j
public class ConcreteHandleOne extends BaseHandle {
    public ConcreteHandleOne(String handleName, BaseHandle nextHandle) {
        super(handleName, nextHandle);
    }

    @Override
    public void processingRequest(RequestObject requestObject) {
        if (beAbleToProcess(requestObject)) {
            log.info("请求处理器1，处理info属性不为空的情况");
        } else {
            //无法处理的请求转发至下一个处理器
            if(this.nextHandle == null){
                return;
            }
            this.nextHandle.processingRequest(requestObject);
        }
    }

    private boolean beAbleToProcess(RequestObject requestObject) {
        return requestObject.getInfo() != null;
    }
}
