package ind.renpeng.advancedjava.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolCreateDemo {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
            }
        });
    }
}
