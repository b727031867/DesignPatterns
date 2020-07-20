package com.designpatterns.bridge;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/9 23:00
 */
public class ServiceImpl implements IService {
    @Override
    public void businessMethod() {
        System.out.println("某种具体变化的业务维度");
    }
}
