package com.designpatterns.interpreter;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 15:51
 */
public abstract class BaseNode {

    /**
     * 对节点进行翻译，每个具体的节点需要自己实现翻译的逻辑
     * @param context 翻译时的上下文
     */
    public abstract void interpret(Context context);

    /**
     * 执行每个节点的操作，每个具体节点需要实现执行逻辑
     */
    public abstract void execute();
}
