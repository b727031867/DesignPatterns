package com.designpatterns.state;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/10 15:40
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
        //通过状态类自身控制状态的转换
        Context context = new Context();
        context.changeState();
        context.handle();
        //通过具体状态类进行切换状态
        context.getCurrentState().stateChange();
        context.handle();

    }
}
