package com.designpatterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:11
 */
@Slf4j
public class SpecificElementOne extends Element {
    @Override
    void accept(BaseVisitor visitor) {
      visitor.visit(this);
      operate();
    }

    void operate(){
        log.info("访问元素一的操作方法");
    }
}
