package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/30 14:55
 * 命令调用者(开关)
 */
@Slf4j
public class CommandInvoker {
    private Stack<BaseCommand> commandStack = new Stack<>();

    public void setBaseCommand(BaseCommand baseCommand) {
        this.baseCommand = baseCommand;
    }

    private BaseCommand baseCommand;

    public CommandInvoker(BaseCommand baseCommand) {
        this.baseCommand = baseCommand;
    }

    public void call() {
        baseCommand.execute();
        commandStack.push(baseCommand);
    }

    public void undo(){
        if(commandStack.peek() != null){
            commandStack.pop().undo();
        }else {
            log.info("没有可撤销的命令");
        }
    }

}
