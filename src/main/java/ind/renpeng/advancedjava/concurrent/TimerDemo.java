package ind.renpeng.advancedjava.concurrent;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args){
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("task run");
            }
        },0,1000);
    }
}
