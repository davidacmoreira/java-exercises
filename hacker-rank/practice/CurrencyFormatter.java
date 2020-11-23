/**
 * Input Format
 *   A single double-precision number denoting payment.
 * 
 * Constraints
 *   0 <= payment <= 10^9
 * 
 * Output Format
 *   On the first line, print US: u where u is payment formatted for US currency.
 *   On the second line, print India: i where i is payment formatted for Indian currency.
 *   On the third line, print China: c where is c payment formatted for Chinese currency.
 *   On the fourth line, print France: f, where f is payment formatted for French currency.
 * 
 * Sample Input
 *   12324.134
 *
 * Sample Output
 *   US: $12,324.13
 *   India: Rs.12,324.13
 *   China: ￥12,324.13
 *   France: 12 324,13 €
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double payment = scanner.nextDouble();
        
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
