package ind.renpeng.advancedjava.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 带有返回值
 * future
 */
public class Demo4 implements Callable<Integer> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask=new FutureTask<>(new Demo4());
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
