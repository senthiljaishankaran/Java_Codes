/*
 * Using Number format class and getCurrencyinstance we denote the given currency in differenct currency format
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currencyformattor {
    public static void main(String[] args) {
        //Creating scanner class for getting currency input from user
        Scanner scanner = new Scanner(System.in);
        double currency =scanner.nextDouble();
        scanner.close();
        // Using Number format to format the given currency to different currency format
        String US = NumberFormat.getInstance(Locale.US).format(currency);
        String China = NumberFormat.getInstance(Locale.CHINA).format(currency);
        String France = NumberFormat.getInstance(Locale.FRANCE).format(currency);
        String India = NumberFormat.getInstance(new Locale("en","in")).format(currency);
        System.out.println("US "+ US);
        System.out.println("China "+ China);
        System.out.println("France " + France);
        System.out.println("India "+ India);
    }
}