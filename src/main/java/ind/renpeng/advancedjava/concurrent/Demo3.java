package ind.renpeng.advancedjava.concurrent;

/**
 * 匿名内部类
 * runnable作为线程任务执行
 */
public class Demo3 {

    public static void main(String[] args)
    {

        new Thread(){
            @Override
            public void run()
            {
                System.out.println(getName());
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
            }
        }).start();

    }
}
