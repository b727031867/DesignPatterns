package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:31
 */
@Slf4j
public class LightOffCommand implements BaseCommand {
    private LightCommandReceiver lightCommandReceiver;

    public LightOffCommand(LightCommandReceiver lightCommandReceiver) {
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        log.info("执行关闭命令");
        lightCommandReceiver.off();
    }

    @Override
    public void undo() {
        log.info("撤销关闭命令");
        lightCommandReceiver.on();
    }
}
