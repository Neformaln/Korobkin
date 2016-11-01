package task5;

import com.sun.org.apache.xpath.internal.operations.And;

import java.util.Scanner;

/**
 * Created by Dibox on 24.10.2016.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Введите 2 числа: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Недопустимая арифметическая операция");
            }
            System.out.println(a % b);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}







