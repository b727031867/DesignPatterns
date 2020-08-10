package com.designpatterns.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/10 15:45
 * 环境类，持有各种状态，自身控制状态转换
 */
@Slf4j
public class Context {
    private BaseState currentState;
    private BaseState specificStatusOne;
    private BaseState specificStatusTwo;

    public Context() {
        //默认是第一种状态
        this.currentState = new SpecificStatusOne(this);
        this.specificStatusOne = this.currentState;
        this.specificStatusTwo = new SpecificStatusTwo(this);
    }

    public BaseState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(BaseState currentState) {
        this.currentState = currentState;
    }

    public void changeState() {
        if (this.currentState == this.specificStatusOne) {
            log.info("当前是状态一，修改为状态二");
            this.currentState = this.specificStatusTwo;
        } else if (this.currentState == this.specificStatusTwo) {
            log.info("当前是状态二，修改为状态一");
            this.currentState = specificStatusOne;
        }
    }

    public void handle() {
        this.currentState.handle();
    }
}
