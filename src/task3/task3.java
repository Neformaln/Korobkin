package task3;

import java.util.Scanner;

/**
 * Created by Dibox on 23.10.2016.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  год: ");
        int i = sc.nextInt();

        if (Integer.toString(i).length() == 4) {
            char c1 = Integer.toString(i).charAt(0);
            char c2 = Integer.toString(i).charAt(1);
            char c3 = Integer.toString(i).charAt(2);
            char c4 = Integer.toString(i).charAt(3);
            String res = "";

            if (c1 == '1') res = "тысяча";
            if (c1 == '2') res = "две тысячи";

            if (c2 == '1') res = res + " сто";
            if (c2 == '2') res = res + " двести";
            if (c2 == '3') res = res + " триста";
            if (c2 == '4') res = res + " четыреста";
            if (c2 == '5') res = res + " пятьсот";
            if (c2 == '6') res = res + " шестьсот";
            if (c2 == '7') res = res + " семьсот";
            if (c2 == '8') res = res + " восемьсот";
            if (c2 == '9') res = res + " девятьсот";

            if (c3 == '1') res = res + " один";
            if (c3 == '2') res = res + " двадцать";
            if (c3 == '2') res = res + " тридцать";
            if (c3 == '4') res = res + " сорок";
            if (c3 == '5') res = res + " пятьдесят";
            if (c3 == '6') res = res + " шестьдесят";
            if (c3 == '7') res = res + " семьдесят";
            if (c3 == '8') res = res + " восемьдесят";
            if (c3 == '9') res = res + " девяносто";


            if (c4 == '1') res = res + " первый";
            if (c4 == '2') res = res + " второй";
            if (c4 == '3') res = res + " третий";
            if (c4 == '4') res = res + " четвертый";
            if (c4 == '5') res = res + " пятый";
            if (c4 == '6') res = res + " шестой";
            if (c4 == '7') res = res + " седьмой";
            if (c4 == '8') res = res + " восьмой";
            if (c4 == '9') res = res + " девятый";


            System.out.println(res);
        }

    }
}

