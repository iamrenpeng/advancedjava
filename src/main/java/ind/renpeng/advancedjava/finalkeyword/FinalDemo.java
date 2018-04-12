package ind.renpeng.advancedjava.finalkeyword;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/12 14:10
 * @description:
 */
public class FinalDemo {
    public static void main(String[] args){
        Student student=new Student();
        student.setName("caden");
       int i=20;
       update(i);
        finalUpdate(i);
        System.out.println(i);
        modify(student);
        finalModify(student);
        System.out.println(student.getName());

    }
    public static void update(int age)
    {
        age=200;
        System.out.println(age);
    }
    public static void finalUpdate(final int age)
    {
        //不能修改
       // age=200;
        System.out.println(age);
    }
    public static  void  modify(Student student)
    {
        student=new Student();
        System.out.println(student.getName());
    }
    public static  void  finalModify(final Student student)
    {
        student.setName("tom");
        System.out.println(student.getName());
    }
}
class Student{
  private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
