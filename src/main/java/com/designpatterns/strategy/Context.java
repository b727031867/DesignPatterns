package com.designpatterns.strategy;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 8:38
 */
public class Context {
    private BaseStrategy strategy;

    public BaseStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    public Context(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(){
        this.strategy.algorithm();
    }
}
