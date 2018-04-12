package ind.renpeng.advancedjava.innerclass.anonymousinnerclass;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/12 10:53
 * @description:
 */
public class Outer {
    public void doThing(){
        new Person(){

            @Override
            public void eat() {
                System.out.println("hi");
            }
        }.eat();
    }
}
abstract class Person{
    public  abstract  void eat();
}
