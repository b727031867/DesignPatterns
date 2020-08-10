package com.designpatterns.state;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/10 15:45
 * 抽象状态类，负责定义状态改变会有哪些行为改变
 * 其持有对应的上下文对象
 */
public abstract class BaseState {

    /**
     * 当前状态负责的上下文(当前上下文与此状态对象关联)
     */
    protected Context context;

    public BaseState(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 定义状态改变(或检查)的方法
     */
    public abstract void stateChange();

    /**
     * 定义状态改变之后，需要执行的方法，由子类实现
     */
    public abstract void handle();
}
