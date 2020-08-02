package com.designpatterns.visitor;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:09
 */
public abstract class BaseVisitor {
    /**
     * 访问者访问元素一
     * @param one 第一种元素
     */
    abstract void visit(SpecificElementOne one);

    /**
     * 访问者访问元素二
     * @param two 元素二
     */
    abstract void visit(SpecificElementTwo two);
}
