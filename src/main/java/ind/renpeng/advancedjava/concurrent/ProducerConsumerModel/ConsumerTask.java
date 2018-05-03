package ind.renpeng.advancedjava.concurrent.ProducerConsumerModel;

import java.util.concurrent.TimeUnit;

public class ConsumerTask implements Runnable {
    Shop shop;

    public ConsumerTask(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.take();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
