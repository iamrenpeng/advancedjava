package ind.renpeng.advancedjava.concurrent;

/**
 * 线程创建的方式
 * runnable作为线程任务执行
 */
public class Demo2 implements Runnable {
    @Override
    public void run() {
      System.out.println("running");
    }
    public static void main(String[] args)
    {
        Demo2 demo2=new Demo2();
        Thread t=new Thread(demo2);
        t.start();
    }
}
