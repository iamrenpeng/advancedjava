package ind.renpeng.advancedjava.concurrent;

import ind.renpeng.advancedjava.utils.SleepUtils;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/2 13:41
 * @description:
 */
public class ThreadStatus {
    //一直睡
    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(200);
            }
        }
    }

    static class Wating implements Runnable {

        @Override
        public void run() {
            synchronized (Wating.class) {
                try {
                    Wating.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Blocked implements Runnable {
        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtils.second(100);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWatingThread").start();
        new Thread(new Wating(), "WatingThread").start();
        new Thread(new TimeWaiting(), "TimeWatingThread").start();
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
    }
}
