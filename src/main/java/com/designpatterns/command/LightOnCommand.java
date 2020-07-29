package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:30
 */
@Slf4j
public class LightOnCommand implements BaseCommand {
    private LightCommandReceiver lightCommandReceiver;

    public LightOnCommand(LightCommandReceiver lightCommandReceiver) {
        this.lightCommandReceiver = lightCommandReceiver;
    }

    @Override
    public void execute() {
        log.info("执行打开命令");
        lightCommandReceiver.on();
    }

    @Override
    public void undo() {
        log.info("撤销打开命令");
        lightCommandReceiver.off();
    }
}
