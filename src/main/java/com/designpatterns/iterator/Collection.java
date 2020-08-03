package com.designpatterns.iterator;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/3 20:05
 */
public interface Collection<T>  {

    /**
     * 移除当前遍历到的对象
     */
    void remove();

    /**
     * 添加一个对象到集合中
     * @param object 被添加到集合的对象
     */
    void add(Object object);


    /**
     * 获取该集合的遍历器
     * @return 遍历器
     */
    Iterator<T> iterator();

}
