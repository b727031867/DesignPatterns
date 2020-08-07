package com.designpatterns.interpreter;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 15:38
 * 解释器模式
 */
public class Client {
    public static void main(String[] args) {
        String text = "LOOP 2 LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 BREAK END";
        Context context = new Context(text);
        ExpressionNode expressionNode = new ExpressionNode();
        expressionNode.interpret(context);
        expressionNode.execute();
    }
}
