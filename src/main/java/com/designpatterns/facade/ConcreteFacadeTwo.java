package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:48
 */
public class ConcreteFacadeTwo extends AbstractFacade {
    private Reader reader = Reader.getInstance();
    private NewCipher newCipher = NewCipher.getInstance();
    private Writer writer = Writer.getInstance();

    @Override
    public void doSomeThings() {
        this.reader.doRead();
        this.newCipher.doEncrypt();
        this.writer.doWriter();
    }
}
