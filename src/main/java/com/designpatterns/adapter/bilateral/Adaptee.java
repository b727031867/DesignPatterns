package com.designpatterns.adapter.bilateral;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:05
 * 被适配的接口（适配者）
 */
public interface Adaptee {
    /**
     * 特殊方法，需要被适配，例如220V的电压提供方法
     * @return 特殊方法的返回值
     */
    int specificMethod();
}
