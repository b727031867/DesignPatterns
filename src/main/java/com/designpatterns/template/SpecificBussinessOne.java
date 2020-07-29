package com.designpatterns.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/29 10:40
 */
@Slf4j
public class SpecificBussinessOne extends BaseTemplate {
    @Override
    protected boolean hookStepTwo() {
        return true;
    }

    @Override
    protected void doStepOne() {
        log.info("执行具体业务1的第一步");

    }

    @Override
    protected  void doStepTwo() {
        log.info("执行具体业务1的第二步");
    }

    @Override
    protected void doStepThree() {
        log.info("执行具体业务1的第三步");
    }
}
