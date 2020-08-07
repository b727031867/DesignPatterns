package com.designpatterns.interpreter;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 15:54
 * 命令节点
 * 一个命令节点可能是循环节点也可能是其他节点
 * 命令节点根据不同类型的节点实现不同的处理方式
 */
public class CommandNode extends BaseNode {
    private BaseNode node;

    @Override
    public void interpret(Context context) {
        if (Command.LOOP.toString().equals(context.getCurrentToken())) {
            //循环命令就交给循环命令节点进行处理
            node = new LoopNode();
        } else {
            //不是循环节点就交给非循环节点解释
            node = new NonLoopNode();
        }
        node.interpret(context);
    }

    @Override
    public void execute() {
        node.execute();
    }
}
