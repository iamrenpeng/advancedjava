package ind.renpeng.advancedjava.innerclass.localinnerclass;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/12 10:51
 * @description:
 */
public class Outer {
    private String name;
    public void say(){
        class  Inner{
            private String name;
        }
        Inner inner=new Inner();
        System.out.println(inner.name);
    }
}
