package task1;
import java.util.Scanner;


/**
 * Created by Дмитрий on 12.10.2016.
 */

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Введите целые числа: ");
        if (sc.hasNextInt()) {
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            System.out.println("НОК заданных чисел " + nok(number1, number2));
            System.out.println("НОД заданных чисел " + nod(number1, number2));
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
        public static int nod(int x, int y) {
            if (y == 0)
                return x;
            else
                return nod(y, x % y);
        }

        public static int nok(int x, int y) {
            return x * y / (nod(x, y));
        }
    }



