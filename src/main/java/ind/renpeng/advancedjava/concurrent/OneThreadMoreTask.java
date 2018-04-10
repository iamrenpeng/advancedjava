package ind.renpeng.advancedjava.concurrent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OneThreadMoreTask extends Thread {
    public static void main(String[] args) throws InterruptedException {
        OneThreadMoreTask oneThreadMoreTask=new OneThreadMoreTask();
        oneThreadMoreTask.execute(new MyTask("1"));
        oneThreadMoreTask.start();
        Thread.sleep(1000);
        oneThreadMoreTask.execute(new MyTask("2"));
        Thread.sleep(1000);
        oneThreadMoreTask.execute(new MyTask("3"));
        Thread.sleep(1000);
        oneThreadMoreTask.execute(new MyTask("4"));
        Thread.sleep(1000);
        oneThreadMoreTask.execute(new MyTask("5"));
        Thread.sleep(1000);
        oneThreadMoreTask.execute(new MyTask("6"));
    }

    List<MyTask> tasks = new ArrayList<>();

    @Override
    public void run() {
        int i=0;
        while (i<100) {
            tasks.get(tasks.size() - 1).run();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public void execute(MyTask r) {
        tasks.add(r);
    }
}

class MyTask implements Runnable {
    private String name;
     public MyTask(String name)
     {
         this.name=name;
     }
    @Override
    public void run() {
        System.out.println("task"+this.name + Thread.currentThread().getName());

    }
}