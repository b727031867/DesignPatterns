package com.designpatterns.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/29 10:40
 */
@Slf4j
public class SpecificBussinessTwo extends BaseTemplate {
    @Override
    protected boolean hookStepOne() {
        return false;
    }

    @Override
    protected void doStepOne() {
        log.info("执行具体业务2的第一步");

    }

    @Override
    protected void doStepTwo() {
        log.info("执行具体业务2的第二步");
    }

    @Override
    protected void doStepThree() {
        log.info("执行具体业务2的第三步");
    }
}
