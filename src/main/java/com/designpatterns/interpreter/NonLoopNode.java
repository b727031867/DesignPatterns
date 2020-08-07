package com.designpatterns.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 15:59
 */
@Slf4j
public class NonLoopNode extends BaseNode {
    private String content;
    private String command;
    @Override
    public void interpret(Context context) {
        command = context.getCurrentToken();
        if(!command.equals(Command.PRINT.toString()) &&
           !command.equals(Command.BREAK.toString()) &&
           !command.equals(Command.SPACE.toString())
        ){
            log.error("出现非法命令，非法的命令是：{}",command);
        }
        context.skipToken(command);
        if(command.equals(Command.PRINT.toString())){
            //记录需要打印的内容
            content = context.getCurrentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if(command.equals(Command.PRINT.toString())){
            log.info("打印内容：{}",content);
        }else if(command.equals(Command.SPACE.toString())){
            log.info("打印空格");
        }else if(command.equals(Command.BREAK.toString())){
            log.info("打印换行");
        }
    }
}
