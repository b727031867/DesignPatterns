package com.designpatterns.visitor;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:10
 */
public abstract class Element {
    abstract void accept(BaseVisitor visitor);
}
