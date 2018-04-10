package ind.renpeng.advancedjava.concurrent;

import java.util.concurrent.*;

/**
 * 带有返回值
 * future
 */
public class ThreadCreateDemo4 implements Callable<Integer> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask=new FutureTask<>(new ThreadCreateDemo4());
        Thread t=new Thread(futureTask);
        t.start();
        Thread.sleep(1000);
        System.out.println(futureTask.get());

    }

    @Override
    public Integer call() throws Exception {
        System.out.println("callable");
        return 1;
    }
}
