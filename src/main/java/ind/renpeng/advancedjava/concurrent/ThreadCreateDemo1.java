package ind.renpeng.advancedjava.concurrent;

/**
 * 线程创建的方式
 * 1、thread
 * 2、runnable
 * 3、匿名内部类
 * 4、带返回值的线程
 * 5、线程池
 * 6、定时器
 * 7、lambda表达式
 * 8、spring多线程
 */
public class ThreadCreateDemo1 extends Thread {
    @Override
    public void run() {
      System.out.println("thread name is"+getName());
    }
    public static void main(String[] args)
    {
        ThreadCreateDemo1 t=new ThreadCreateDemo1();
        t.start();
    }
}
