package com.designpatterns.combination;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/11 21:31
 * 组合模式,也叫部分整体模式,常用于树形结构的系统
 */
public abstract class AbstractComponent {

    protected String name;
    protected String description;

    public void add(AbstractComponent abstractComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractComponent abstractComponent) {
        throw new UnsupportedOperationException();
    }

    public AbstractComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 打印子节点或叶子节点的信息
     */
    public abstract void printInfo();
}
