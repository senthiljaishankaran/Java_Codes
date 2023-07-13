/*
 * Task:
 * write the method, getDay, which returns the day on that date.
 
 * findDay has the following parameters:

        int: month
        int: day
        int: year
        Returns
string: the day of the week in capital letters
 
 * Constriant:
 *  2000 <= year <= 3000
 */




import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Result {
        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */
        public static String findDay(int month, int day, int year) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONTH,month-1); // calendar set accepts only int
            cal.set(Calendar.DAY_OF_MONTH,day);// calendar set accepts only int
            cal.set(Calendar.YEAR,year);// calendar set accepts only int
    String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
            return dayOfWeek; // using DAY_OF_WEEK, LONG format and setting Locale to US
        }
    }
    public class DateandTime {
        public static void main(String[] args) throws IOException {
                Scanner in = new Scanner(System.in);
                int month = in.nextInt(); // getting month in int
                int day = in.nextInt();// getting day in int
                int year = in.nextInt();// getting year in int
                String res = Result.findDay(month, day, year);
                System.out.println(res);
                in.close();
        }
    }

