package com.designpatterns.chain;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 12:44
 */
public class RequestObject {
    private String info;

    public RequestObject(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
