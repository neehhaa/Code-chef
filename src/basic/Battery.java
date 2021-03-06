/*
Battery Low :
Chef's phone shows a Battery Low notification if the battery level is 15% or less.
Given that the battery level of Chef's phone is X %,
determine whether it would show a Battery low notification.
 */

package basic;

import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int battery = input.nextInt();
            if (battery > 15){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
