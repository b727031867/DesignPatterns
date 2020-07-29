package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:33
 * 用于处理空命令
 */
@Slf4j
public class NoCommand implements BaseCommand {
    @Override
    public void execute() {
        log.info("执行空命令");
    }

    @Override
    public void undo() {
        log.info("撤销空命令");
    }
}
