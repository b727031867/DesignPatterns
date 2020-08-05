package com.designpatterns.intermediary;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/5 16:37
 */
public abstract class BaseColleague {
    private BaseIntermediary baseIntermediary;

    public BaseIntermediary getBaseIntermediary() {
        return baseIntermediary;
    }

    public void setBaseIntermediary(BaseIntermediary baseIntermediary) {
        this.baseIntermediary = baseIntermediary;
    }

    public BaseColleague(BaseIntermediary baseIntermediary) {
        this.baseIntermediary = baseIntermediary;
    }


    public void change(){
        baseIntermediary.interactiveBehavior(this);
    }

    /**
     * 具体同事修改自身的方法
     */
    abstract void modifyItself();

}
