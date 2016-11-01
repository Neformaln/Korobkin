package task4;

import java.util.Scanner;

/**
 * Created by Dibox on 23.10.2016.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Введите числа a и b : ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            c = a; //Третья переменная:
            a = b;
            b = c;
            System.out.println("Получаем a = " + a);
            System.out.println("Получаем b = " + b);
        } else {
            System.out.println("Вы ввели не целое число");
        }


    }
}

 //XOR:
      //  a=a^b;
       // b=a^b;
       // a=a^b;
       // System.out.println("Получаем a = " + a);
       // System.out.println("Получаем b = " + b);