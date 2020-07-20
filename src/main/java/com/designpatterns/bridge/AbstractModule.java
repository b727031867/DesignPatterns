package com.designpatterns.bridge;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/9 22:48
 */
public abstract class AbstractModule {
    protected IService iService;
    public AbstractModule(IService iService){
        this.iService = iService;
    }

    /**
     * 抽象变化的维度
     */
    public abstract void abstractMethod();

}
