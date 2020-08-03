package com.designpatterns.iterator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/3 19:56
 */
public interface Iterator<T> {

    /**
     * 正序遍历的下一位
     * @return 下一位对象
     */
    T next();

    /**
     * 是否具有正序遍历的下一位对象
     * @return 是否具有下一位
     */
    boolean hasNext();

    /**
     * 倒序遍历的下一位
     * @return 下一位对象
     */
    T previous();

    /**
     * 是否具有倒叙遍历的下一位对象
     * @return 是否具有下一位
     */
    boolean hasPrevious();

}
