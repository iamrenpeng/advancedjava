package ind.renpeng.advancedjava.concurrent;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void test1() throws InterruptedException {
        System.out.println("test1"+Thread.currentThread().getName());
        Thread.sleep(10000);
    }
    @Async
    public void test2()
    {
        System.out.println("test2"+Thread.currentThread().getName());
    }
}
