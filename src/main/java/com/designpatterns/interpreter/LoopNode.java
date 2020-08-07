package com.designpatterns.interpreter;


/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 16:02
 */
public class LoopNode extends BaseNode {
    private int number;
    private BaseNode node;

    @Override
    public void interpret(Context context) {
        //跳过循环标识
        context.skipToken(Command.LOOP.toString());
        number = context.getLoopNumber();
        context.nextToken();
        //设置循环体
        node = new ExpressionNode();
        //进行解释
        node.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0;i<number;i++){
            node.execute();
        }
    }
}
