/**
 * Task
 *   
 * 
 * Input Format
 *   
 * 
 * Output Format
 *   .
 * 
 * Sample Input
 *   5
 *   -150
 *   150000
 *   1500000000
 *   213333333333333333333333333333333333
 *   -100000000000000
 *
 * Sample Output
 *   -150 can be fitted in:
 *   * short
 *   * int
 *   * long
 *   150000 can be fitted in:
 *   * int
 *   * long
 *   1500000000 can be fitted in:
 *   * int
 *   * long
 *   213333333333333333333333333333333333 can't be fitted anywhere.
 *   -100000000000000 can be fitted in:
 *   * long
 */

import java.util.Scanner;

class Datatypes {
    public static void main(String []argh) {        
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=0; i<t; i++) {
            try {
                long x = scanner.nextLong();

                System.out.println(x + " can be fitted in:");

                if (x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");

                if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");

                if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
