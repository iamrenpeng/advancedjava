package ind.renpeng.advancedjava.concurrent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo5 {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        AsyncService asyncService = annotationConfigApplicationContext.getBean(AsyncService.class);
        asyncService.test1();
        asyncService.test2();
    }
}
