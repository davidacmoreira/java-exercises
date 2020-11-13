import java.util.Scanner;

/**
 * Output Format
 *
 * Print Weird if the number is weird; otherwise, print Not Weird.
 *
 * Sample Input 0
 * 3
 * Sample Output 0
 * Weird
 *
 * Sample Input 1
 * 24
 * Sample Output 1
 * Not Weird
 */

public class IfElse {
    private static void weirdNumber(int n) {
        if ((n % 2) != 0) {
            System.out.println("Weird");
        }
        else {
            if (n > 20) {
                System.out.println("Not Weird");
            }
            else {
                if ((n > 2) && (n <= 5)) {
                    System.out.println("Not Weird");
                }
                else {
                    System.out.println("Weird");
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        weirdNumber(n);
        scanner.close();
    }
}
