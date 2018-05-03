package ind.renpeng.advancedjava.generics;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/3/29 17:29
 * @description:
 */
public interface GenericInterface<T> {
      void method1(T t);
}
 class SubClass<T> implements  GenericInterface<T>{

     @Override
     public void method1(T t) {
         System.out.println(t);
     }

     public static void main(String[] args) {
         SubClass<String> subClass=new SubClass<>();
         subClass.method1("123");
     }
 }