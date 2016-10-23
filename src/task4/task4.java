package task4;

import java.util.Scanner;

/**
 * Created by Dibox on 23.10.2016.
 */
public class task4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        int c;

       /* //Третья переменная:
        c = a;
        a = b;
        b = c;
        System.out.println("Получаем a = " + a);
        System.out.println("Получаем b = " + b);*/

        //XOR:
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Получаем a = " + a);
        System.out.println("Получаем b = " + b);

    }
}
