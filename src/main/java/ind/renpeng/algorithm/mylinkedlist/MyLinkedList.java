package ind.renpeng.algorithm.mylinkedlist;

import java.util.Iterator;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/24 9:09
 * @description:
 */
public class MyLinkedList<T> implements Iterable<T> {
    private static class Node<T>{
        private Node<T> prev;
        private Node<T> next;
        private T data;


    }
    private static  class LinkedListIterator<T>{

    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
