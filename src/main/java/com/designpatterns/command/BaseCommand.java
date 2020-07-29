package com.designpatterns.command;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:29
 */
public interface BaseCommand {
    /**
     * 执行操作
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
