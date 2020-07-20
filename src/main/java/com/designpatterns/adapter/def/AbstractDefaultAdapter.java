package com.designpatterns.adapter.def;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:09
 * 缺省（单接口）适配器类，空实现接口方法，让子类能够有选择性的重写接口
 */
public abstract class AbstractDefaultAdapter implements IService {

    @Override
    public int method5V() {
        //为了让子类有选择的实现接口中的方法，而不编译报错，因此空实现
        return 0;
    }

    @Override
    public int method10V() {
        //为了让子类有选择的实现接口中的方法，而不编译报错，因此空实现
        return 0;
    }
}
