package ind.renpeng.advancedjava.innerclass.staticinnerclass;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/11 13:35
 * @description:
 */
public class Outer {
    private String name;
    private static String sex;
    public void say() {
        Inner inner=new Inner();
        System.out.println(inner.age);
        System.out.println(Inner.name);
        System.out.println("outer");
    }
    static class Inner{
        private int age;
        private static String name;
        public void doThing(){
            System.out.println("innner"+Outer.sex);
        }
    }

}
