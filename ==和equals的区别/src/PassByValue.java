import sun.applet.Main;

import java.sql.SQLOutput;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/12 13:07
 */
public class PassByValue {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}


class Test7{


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0]);
        chang(arr);
        System.out.println(arr[0]);
    }

    private static void chang(int[] array) {
        //将数组的第一个元素变为0
        array[0] = 0;
    }
    
}


