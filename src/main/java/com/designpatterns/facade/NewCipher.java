package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:49
 */
public class NewCipher {
    private static NewCipher newCipher = new NewCipher();
    private NewCipher(){}
    public static   NewCipher getInstance(){
        return newCipher;
    }

    public void doEncrypt(){
        System.out.println("使用新版加密方法加密了信息!");
    }
}
