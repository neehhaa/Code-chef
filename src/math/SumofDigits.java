//Sum of Digits
package math;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int number = input.nextInt();
            int sum = 0;
            while (number > 0) {
                int last = number % 10;
                number = number / 10;
                sum = last + sum;
            }
            System.out.println(sum);
        }
    }
}