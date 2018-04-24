package ind.renpeng.advancedjava.concurrent;

import java.util.concurrent.TimeUnit;

public class SynchonizeDemo {

    public static void main(String[] args){
        Person person=new Person();
        new Thread(new Runnable() {
            @Override
            public void run() {
                person.say();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                person.eat();
            }
        }).start();

    }
}
class Person{
    public synchronized void say()  {

        System.out.println("say");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  synchronized void eat()  {
        System.out.println("eat");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
