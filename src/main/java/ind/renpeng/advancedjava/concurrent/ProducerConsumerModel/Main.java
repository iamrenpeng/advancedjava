package ind.renpeng.advancedjava.concurrent.ProducerConsumerModel;

public class Main {
    public static void main(String[] args){
        Shop shop=new Shop();
        ConsumerTask c=new ConsumerTask(shop);
        ProducerTask p=new ProducerTask(shop);
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();

        new Thread(c).start();
        new Thread(c).start();



    }
}
