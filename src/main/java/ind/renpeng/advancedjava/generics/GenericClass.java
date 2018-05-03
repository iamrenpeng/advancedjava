package ind.renpeng.advancedjava.generics;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/3/29 17:28
 * @description:
 * 类型参数可以作为域、方法参数和方法返回值
 */
public class GenericClass<T> {
    T  t;
    public T method1(T t){
        return t;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass=new GenericClass<>();
        System.out.println(genericClass.method1("111"));
    }
}
