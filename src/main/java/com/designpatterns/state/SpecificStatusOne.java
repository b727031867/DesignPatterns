package com.designpatterns.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/10 15:48
 */
@Slf4j
public class SpecificStatusOne extends BaseState {
    public SpecificStatusOne(Context context) {
        super(context);
    }

    @Override
    public void stateChange() {
        log.info("状态类一进行转换状态,转换成状态二");
        context.setCurrentState(new SpecificStatusTwo(context));
    }

    @Override
    public void handle() {
        log.info("在状态一的状态下，进行业务处理");
    }
}
