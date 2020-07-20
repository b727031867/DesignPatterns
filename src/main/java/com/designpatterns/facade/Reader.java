package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:41
 */
public class Reader {
    private static Reader reader = new Reader();
    private Reader(){}
    public static Reader getInstance(){
        return reader;
    }

    public void doRead(){
        System.out.println("读取了文件!");
    }
}
