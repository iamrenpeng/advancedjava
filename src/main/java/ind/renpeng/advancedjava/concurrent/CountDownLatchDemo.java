package ind.renpeng.advancedjava.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/9 14:12
 * @description:
 */
public class CountDownLatchDemo {
    CountDownLatch countDownLatch=new CountDownLatch(4);
    public static void main(String[] args) throws InterruptedException {
        CountDownLatchDemo countDownLatchDemo=new CountDownLatchDemo();
        countDownLatchDemo.start();
    }
    public void start() throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        CountDownLatchDemo countDownLatchDemo=new CountDownLatchDemo();
        for(int i=0;i<4;i++){
        executorService.submit(new Player());}
        countDownLatch.await();
        System.out.println("比赛结束");
    }
    class Player implements Runnable{

        @Override
        public void run() {
            System.out.println("running");

            try {
                Thread.sleep((int)(Math.random()*10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }
    }

}
