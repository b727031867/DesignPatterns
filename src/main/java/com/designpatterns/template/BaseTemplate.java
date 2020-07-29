package com.designpatterns.template;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/29 10:33
 */
public abstract class BaseTemplate {
    /**
     * 算法骨架的第一步
     */
    protected abstract void doStepOne();

    /**
     * 算法骨架的第二步
     */
    protected abstract void doStepTwo();

    /**
     * 算法骨架的第三步
     */
    protected abstract void doStepThree();

    /**
     * 模板方法(算法骨架)
     */
    public final void template() {
        if (hookStepOne()) {
            doStepOne();
        }
        if (hookStepTwo()) {
            doStepTwo();
        }
        doStepThree();
    }

    /**
     * 默认需要执行步骤二
     *
     * @return 是否执行步骤二
     */
    protected boolean hookStepTwo() {
        return false;
    }

    /**
     * 默认需要执行步骤一
     *
     * @return 是否执行步骤一
     */
    protected boolean hookStepOne() {
        return true;
    }
}
