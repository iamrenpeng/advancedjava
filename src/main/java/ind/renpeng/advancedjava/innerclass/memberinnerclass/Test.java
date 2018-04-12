package ind.renpeng.advancedjava.innerclass.memberinnerclass;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/11 13:38
 * @description:
 */
public class Test {
    public static void main(String[] args){
        Outer.Inner inner=new Outer().new Inner();
        inner.doThing();
    }
}
