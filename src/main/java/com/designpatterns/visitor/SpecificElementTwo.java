package com.designpatterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:13
 */
@Slf4j
public class SpecificElementTwo extends Element {
    @Override
    void accept(BaseVisitor visitor) {
        visitor.visit(this);
        operate();
    }

    void operate() {
        log.info("访问元素二的操作方法");
    }
}
