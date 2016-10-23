package task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by StudentTC on 13.10.2016.
 * сделать класс, помогающий работать с датами. В классе должно быть свойство date (long) и сеттер к нему.
 В date хранится количество миллисекунд. В классе должны быть методы: getDate() - который вернет дату
 в виде "7 апрель 1987" по количеству миллисекунд, прошедших с 1 января 1970 года 00:00
 а также метод getTime() который вернет текущее время ("07:24")
 */

public class Date
{
    public static void main(String[] args)
    {
        String date = getDate();
        String time = getTime();
        System.out.println(date);
        System.out.println(time);
    }
    private static String getDate()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy");
        String a1 = date.format(cal.getTime());
        return (a1);

    }
    private static String getTime()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        String a2 = time.format(cal.getTime());
        return a2;
    }

}
