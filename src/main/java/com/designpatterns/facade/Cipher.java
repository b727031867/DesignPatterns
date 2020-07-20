package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:44
 */
public class Cipher {
    private static Cipher cipher = new Cipher();
    private Cipher(){}
    public static   Cipher getInstance(){
        return cipher;
    }

    public void doEncrypt(){
        System.out.println("加密了信息!");
    }
}
