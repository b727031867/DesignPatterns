package com.designpatterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:14
 */
@Slf4j
public class SpecificVisitorOne extends BaseVisitor {
    @Override
    void visit(SpecificElementOne one) {
        log.info("访问者一，拜访元素一");
    }

    @Override
    void visit(SpecificElementTwo two) {
        log.info("访问者一，拜访元素二");
    }
}
