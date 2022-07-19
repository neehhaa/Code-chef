//Chef and NextGen
package math;

import java.util.Scanner;

public class NextGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-->0){
            int power = input.nextInt();
            int years = input.nextInt();
            int moonGramsOfHelium = input.nextInt();
            int oneGmHeliumPower = input.nextInt();
            int totalPower = oneGmHeliumPower * moonGramsOfHelium;
            int totalPowerNeeded = power * years;
            if (totalPower >= totalPowerNeeded){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
