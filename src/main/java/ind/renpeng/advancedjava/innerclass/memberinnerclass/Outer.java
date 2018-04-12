package ind.renpeng.advancedjava.innerclass.memberinnerclass;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/11 13:35
 * @description:
 */
public class Outer {
    private String name;
    public void say() {
        System.out.println("outer");
    }
    class Inner{
        private int age;
        public void doThing(){
            System.out.println("innner"+Outer.this.name);
        }
    }

}
