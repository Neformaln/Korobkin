package task5;

import java.util.Scanner;

/**
 * Created by Dibox on 24.10.2016.
 */
public class task5 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a % 0);
        } catch (Exception e) {
            System.out.println("Произошла недопустимая арифметическая операция.");
        }

        System.out.println(a % b);


    }
        }


