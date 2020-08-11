package com.designpatterns.chain;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 12:40
 * 职责链模式
 */
public class Client {
    public static void main(String[] args) {
        //创建请求对象
        RequestObject request = new RequestObject("AAA");
        //组合责任链
        ConcreteHandleTwo two = new ConcreteHandleTwo("two", null);
        ConcreteHandleOne one = new ConcreteHandleOne("one", two);
        //进行处理
        one.processingRequest(request);
        //修改责任链
        two.setNextHandle(one);
        one.setNextHandle(null);
        //再次进行处理
        request.setInfo(null);
        two.processingRequest(request);
    }
}
