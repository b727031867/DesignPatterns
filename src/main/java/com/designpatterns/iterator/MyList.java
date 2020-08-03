package com.designpatterns.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/3 20:32
 */
@Slf4j
public class MyList implements Collection<Object> {
    private LinkedList<Object> lists = new LinkedList<>();

    @Override
    public void remove() {
        if (!lists.isEmpty()) {
            lists.remove(lists.getLast());
        } else {
            log.warn("当前list为空，却执行了remove操作！");
        }
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyListIterator();
    }

    @Override
    public void add(Object object) {
        lists.add(object);
    }

    private class MyListIterator implements Iterator<Object> {

        private int cursor1;
        private int cursor2;

        public MyListIterator() {
            cursor1 = 0;
            cursor2 = lists.size() - 1;
        }

        @Override
        public Object next() {
            return lists.get(cursor1++);
        }

        @Override
        public boolean hasNext() {
            return cursor1 < lists.size();
        }

        @Override
        public Object previous() {
            return lists.get(cursor2--);
        }

        @Override
        public boolean hasPrevious() {
            return cursor2 > -1;
        }
    }

}
