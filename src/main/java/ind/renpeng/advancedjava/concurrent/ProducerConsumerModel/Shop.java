package ind.renpeng.advancedjava.concurrent.ProducerConsumerModel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Shop {
    private List<String> list=new LinkedList<>();
    private static  final int MAX=10;
    public synchronized void put() {
        System.out.println(Thread.currentThread().getName());
        while (list.size()>=MAX){
            System.out.println("库存已满"+list.size());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add("apple");
        System.out.println(Thread.currentThread().getName()+"生产了一个");
        notifyAll();
    }
    public synchronized void take(){
        System.out.println(Thread.currentThread().getName());
        while (list.size()==0){
            System.out.println("库存为空"+list.size());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.remove(list.size()-1);
        System.out.println(Thread.currentThread().getName()+"消费了一个");
        notifyAll();
    }
}
