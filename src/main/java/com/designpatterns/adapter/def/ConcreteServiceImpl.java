package com.designpatterns.adapter.def;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/6/30 20:05
 * 具体的接口实现类，它可以有选择的实现IService中的方法
 */
public class ConcreteServiceImpl extends AbstractDefaultAdapter {
    /**
     * 特殊方法，需要被适配，例如220V的电压提供方法
     * @return 特殊方法的返回值
     */
    @Override
   public int method5V(){
        return 220;
    }
}
