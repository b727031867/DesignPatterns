package com.designpatterns.combination;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/11 21:36
 */
public class Leaf extends AbstractComponent {

    public Leaf(String name, String description) {
        super(name, description);
    }

    @Override
    public void printInfo() {
        System.out.println("当前叶子的名称是:"+name+",描述是:"+description);
    }
}
