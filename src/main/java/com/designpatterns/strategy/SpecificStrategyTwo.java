package com.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 8:44
 */
@Slf4j
public class SpecificStrategyTwo extends BaseStrategy {
    @Override
    public void algorithm() {
      log.info("使用具体策略二进行计算");
    }
}
