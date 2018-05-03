package ind.renpeng.advancedjava.concurrent.ProducerConsumerModel;

import java.util.concurrent.TimeUnit;

public class ProducerTask implements Runnable {
    Shop shop;

    public ProducerTask(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.put();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
