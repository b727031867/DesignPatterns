package com.designpatterns.bridge;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/9 22:57
 */
public class SpecificModule extends AbstractModule {

    public SpecificModule(IService iService) {
        super(iService);
    }

    @Override
    public void abstractMethod() {
        System.out.println("某个具体的模块");
        iService.businessMethod();
    }
}
