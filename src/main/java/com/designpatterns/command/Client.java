package com.designpatterns.command;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:28
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        LightCommandReceiver lightCommandReceiver = new LightCommandReceiver();
        LightOffCommand lightOffCommand = new LightOffCommand(lightCommandReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightCommandReceiver);
        lightOffCommand.execute();
        lightOffCommand.undo();
        lightOnCommand.execute();
        lightOnCommand.undo();
    }
}
