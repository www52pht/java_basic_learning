/**
 * @author www
 * @version 1.0
 * @create 2021/2/11 23:10
 */
public class Test {
    public static void main(String[] args) {
        Integer i1 = 100;
        int i = 9;
        int j = 9;
        String b = "haha"; //这是放在常量池中
        String c = "haha"; //在常量池中找
        if (b.equals(c)) {
            System.out.println("bEQc");
        }
    }
}


/**
 * equals
 */
class Test1 {
    public static void main(String[] args) {
        String a = new String("ab"); // a 为⼀个引⽤
        String b = new String("ab"); // b为另⼀个引⽤,对象的内容⼀样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        if (aa == bb) { // true
            System.out.println("aa==bb");
        }
        if (a == b) { // false，⾮同⼀对象

            System.out.println("a==b");
        }
        if (a.equals(b)) { // true

            System.out.println("aEQb");
        }
        if (42 == 42.0) { // true
            System.out.println("true");
        }
    }
}

class Test2 {
    public static void main(String[] args) {

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}

class Test3 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(g.equals(a + h));
    }
}

