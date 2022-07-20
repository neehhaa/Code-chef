//Passes for Fair
package contest;

import java.util.Scanner;

public class PassesForFair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int passes = input.nextInt();
            int totalPeople = friends + 1;
            if (passes >= totalPeople){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
