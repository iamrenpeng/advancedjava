package ind.renpeng.advancedjava.generics;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/3/29 17:28
 * @description:
 * 可以定义在普通类中也可以定义在泛型类中
 */
public class GenericMethod {


    public <T> T getObject(T t)
    {
          System.out.println(t);
          return t;
    }

    public static void main(String[] args) {
        GenericMethod genericMethod=new GenericMethod();
        String aa=genericMethod.getObject("1111");
        System.out.println(aa);
    }
}

