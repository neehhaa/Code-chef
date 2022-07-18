//True and False Paper
package lunchtime;

import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int questions = input.nextInt();
            int aliceMarks = input.nextInt();
            int bobMarks = questions - aliceMarks;
            System.out.println(bobMarks);

        }
    }
}