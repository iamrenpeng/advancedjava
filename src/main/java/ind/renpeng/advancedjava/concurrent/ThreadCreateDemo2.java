package ind.renpeng.advancedjava.concurrent;

/**
 * 线程创建的方式
 * runnable作为线程任务执行
 */
public class ThreadCreateDemo2 implements Runnable {
    @Override
    public void run() {
      System.out.println("running");
    }
    public static void main(String[] args)
    {
        ThreadCreateDemo2 threadCreateDemo2 =new ThreadCreateDemo2();
        Thread t=new Thread(threadCreateDemo2);
        t.start();
    }
}
