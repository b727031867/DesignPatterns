package com.designpatterns.facade;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/7/14 7:46
 */
public class ConcreteFacadeOne extends AbstractFacade {
    private Reader reader = Reader.getInstance();
    private Cipher cipher = Cipher.getInstance();
    private Writer writer = Writer.getInstance();

    @Override
    public void doSomeThings() {
        this.reader.doRead();
        this.cipher.doEncrypt();
        this.writer.doWriter();
    }
}
