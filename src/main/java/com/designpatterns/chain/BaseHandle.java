package com.designpatterns.chain;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/11 12:43
 */
public abstract class BaseHandle {

    /**
     * 处理器的名称
     */
    private String handleName;

    public BaseHandle(String handleName, BaseHandle nextHandle) {
        this.handleName = handleName;
        this.nextHandle = nextHandle;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    public BaseHandle getNextHandle() {
        return nextHandle;
    }

    public void setNextHandle(BaseHandle nextHandle) {
        this.nextHandle = nextHandle;
    }

    /**
     * 下一位处理请求的节点
     */
    protected BaseHandle nextHandle;

    /**
     * 请求的处理方法
     *
     * @param requestObject 请求对象
     */
    public abstract void processingRequest(RequestObject requestObject);
}
