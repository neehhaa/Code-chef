//MATH1 Enrolment
package math;

import java.util.Scanner;

public class MathEnrollment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int seats = input.nextInt();
            int students = input.nextInt();
            int seatsNeeded = students - seats;
            if (seats >= students){
                System.out.println(0);
            }
            else {
                System.out.println(seatsNeeded);
            }
        }
    }
}
