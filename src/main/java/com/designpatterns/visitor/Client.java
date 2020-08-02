package com.designpatterns.visitor;



/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:09
 * 访问者模式
 */
public class Client {
    public static void main(String[] args) {
        Element element1,element2,element3;
        element1 = new SpecificElementOne();
        element2 = new SpecificElementOne();
        element3 = new SpecificElementTwo();
        BaseVisitor visitor1,visitor2;
        visitor1 = new SpecificVisitorOne();
        visitor2 = new SpecificVisitorTwo();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(element1);
        objectStructure.addElement(element2);
        objectStructure.addElement(element3);
        //由访问者一去访问被访问的对象
        objectStructure.accept(visitor1);
        //由访问者二去访问被访问的对象
        objectStructure.accept(visitor2);
    }
}
