package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:43
 */
public class Writer {
    private static Writer writer = new Writer();
    private Writer(){}
    public static Writer getInstance(){
        return writer;
    }

    public void doWriter(){
        System.out.println("写入了文件!");
    }
}
