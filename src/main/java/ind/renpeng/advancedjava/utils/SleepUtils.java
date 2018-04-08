package ind.renpeng.advancedjava.utils;

import java.util.concurrent.TimeUnit;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/2 14:05
 * @description:
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
