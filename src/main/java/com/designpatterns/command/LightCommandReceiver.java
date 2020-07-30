package com.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/28 13:28
 */
@Slf4j
public class LightCommandReceiver {
    public String getStatus() {
        return status;
    }

    private String status = "off";

    public void on() {
        this.status = "on";
        log.info("电灯{}打开，状态为{}", this.hashCode(), this.status);
    }

    public void off() {
        this.status = "off";
        log.info("电灯{}关闭，状态为{}", this.hashCode(), this.status);
    }
}
