package ind.renpeng.algorithm.mylinkedlist;

import com.sun.xml.internal.bind.AnyTypeAdapter;

import java.util.Iterator;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/24 9:09
 * @description:
 */
public class MyLinkedList<T> implements Iterable<T> {
    private static class Node<T>{
        public Node(T t,Node<T> prev,Node<T> next)
        {
            this.data=t;
            this.prev=prev;
            this.next=next;
        }
        private Node<T> prev;
        private Node<T> next;
        private T data;

    }
    private  class LinkedListIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
    public MyLinkedList(){

    }
    public void clear(){}
    public int size(){}
    public  boolean isEmpty(){}
    public boolean add(T t){}
    public void  add(int idx,T t){}
    public T get(int idx){}
    public T set(int idx,T t)
    {}
    public T remove(int idx){}
    private void addBefore(Node<T> p,T t){}
     private T remove(Node<T> node){}
     private Node<T> getNode(int idx){}

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
    private int theSize;
    private int modCount=0;
    private Node<T> beaginMarker;
    private Node<T> endMarker;

}
