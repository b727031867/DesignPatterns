package com.designpatterns.bridge;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/10 7:17
 */
public class OrtherMoudule extends AbstractModule {

    public OrtherMoudule(IService iService) {
        super(iService);
    }

    @Override
    public void abstractMethod() {
        System.out.println("另外一个模块");
        iService.businessMethod();
    }
}
