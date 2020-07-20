package com.designpatterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/11 21:40
 */
public class FirstComposite extends AbstractComponent {

    private List<AbstractComponent> abstractComponentList = new ArrayList<>(16);
    public FirstComposite(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(AbstractComponent abstractComponent) {
        abstractComponentList.add(abstractComponent);
    }

    @Override
    public void remove(AbstractComponent abstractComponent) {
        abstractComponentList.remove(abstractComponent);
    }

    @Override
    public void printInfo() {
        System.out.println("First打印子节点信息开始");
        for (AbstractComponent component : abstractComponentList) {
            System.out.println("First的Name:" + name + " First的Description:" + description);
            component.printInfo();
        }
        System.out.println("First打印子节点信息结束");
    }
}
