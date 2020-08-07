package com.designpatterns.interpreter;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 16:04
 */
public enum Command {
    /**
     * 循环命令
     */
    LOOP,

    /**
     * 循环命令的结束符
     */
    END,

    /**
     * 打印输出命令
     */
    PRINT,

    /**
     * 换行命令
     */
    BREAK,

    /**
     * 空格命令
     */
    SPACE;
}
