package com.designpatterns.combination;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/11 21:54
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent first = new FirstComposite("第一层","这个节点是第一层的节点（最顶层）");
        AbstractComponent sec1 = new SecondComposite("第二层","这个节点是第二层的节点");
        AbstractComponent sec2 = new SecondComposite("第二层","这个节点是第二层的节点");
        first.add(sec1);
        first.add(sec2);
        AbstractComponent leaf1 = new Leaf("叶子1","这是最底层的叶子节点，不支持添加与删除子节点的方法");
        AbstractComponent leaf2 = new Leaf("叶子2","这是最底层的叶子节点，不支持添加与删除子节点的方法");
        AbstractComponent leaf3 = new Leaf("叶子3","这是最底层的叶子节点，不支持添加与删除子节点的方法");
        AbstractComponent leaf4 = new Leaf("叶子4","这是最底层的叶子节点，不支持添加与删除子节点的方法");
        sec1.add(leaf1);
        sec1.add(leaf2);
        sec2.add(leaf3);
        sec2.add(leaf4);
        first.printInfo();
        System.out.println("===============================================");
        sec1.printInfo();
        System.out.println("===============================================");
        leaf1.printInfo();
    }
}
