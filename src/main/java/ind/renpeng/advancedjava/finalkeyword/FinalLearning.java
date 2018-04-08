package ind.renpeng.advancedjava.finalkeyword;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/8 15:17
 * @description:
 */
public class FinalLearning {
    public static void main(String[] args) {
        String a="hello";
        final String b="hello";
        String c=a+2;
        String d=b+"2";
        String e="hello2";
        System.out.println("c的值为"+c);
        System.out.println("d的值为"+d);
        System.out.println("a==b?"+(a==b));
        System.out.println("c==e?"+(c==e));
        System.out.println("d==e?"+(d==e));
        System.out.println("c==d?"+(c==d));
        System.out.println("cequald?"+(c.equals(d)));

    }
}
