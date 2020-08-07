package com.designpatterns.interpreter;

import java.util.ArrayList;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 16:40
 * 表达式节点，由多个命令节点组成
 */
public class ExpressionNode extends BaseNode {

    private ArrayList<BaseNode> commands = new ArrayList<>(10);

    @Override
    public void interpret(Context context) {
        //文本存在后续就持续翻译
        while (context.getCurrentToken() != null) {
            //对END标签进行跳出，表示循环命令结束
            if (context.getCurrentToken().equals(Command.END.toString())) {
                //跳过循环结束的标签
                context.skipToken(context.getCurrentToken());
                break;
            } else {
                //对命令进行翻译
                BaseNode node = new CommandNode();
                node.interpret(context);
                commands.add(node);
            }
        }
    }

    @Override
    public void execute() {
        for (BaseNode command : commands) {
            command.execute();
        }
    }
}
