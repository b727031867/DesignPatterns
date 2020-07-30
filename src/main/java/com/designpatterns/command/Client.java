package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:28
 * 命令模式
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        LightCommandReceiver lightCommandReceiver = new LightCommandReceiver();
        //默认状态为关闭
        log.info("电灯初始状态为：{}",lightCommandReceiver.getStatus());
        LightOffCommand lightOffCommand = new LightOffCommand(lightCommandReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightCommandReceiver);
        CommandInvoker commandInvoker = new CommandInvoker(lightOnCommand);
        commandInvoker.call();
        commandInvoker.setBaseCommand(lightOffCommand);
        commandInvoker.call();
        commandInvoker.undo();
        commandInvoker.undo();
        log.info("电灯结束状态为：{}",lightCommandReceiver.getStatus());
    }
}
