package com.designpatterns.visitor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/2 15:18
 */
@Slf4j
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>(16);

    public void accept(BaseVisitor baseVisitor) {
        for (Element element : elements) {
            log.info("访问者----开始访问复杂对象");
            element.accept(baseVisitor);
            log.info("访问者----结束访问复杂对象");
        }
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
