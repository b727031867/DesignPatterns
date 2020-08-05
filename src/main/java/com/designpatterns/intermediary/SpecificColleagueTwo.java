package com.designpatterns.intermediary;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/5 16:52
 */
public class SpecificColleagueTwo extends BaseColleague {
    /**
     * 同事内部的状态
     */
    private int status;

    private int otherStatus = 0;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOtherStatus() {
        return otherStatus;
    }

    public void setOtherStatus(int otherStatus) {
        this.otherStatus = otherStatus;
    }

    public SpecificColleagueTwo(BaseIntermediary baseIntermediary,int status) {
        super(baseIntermediary);
        this.status = status;
    }

    @Override
    void modifyItself() {
        status++;
    }
}
