//Sugarcane Juice Business
package math;

import java.util.Scanner;

public class Sugarcane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-->0) {
            int glasses = input.nextInt();
            int total = glasses * 50;
            int profit = (int) (total * 0.3);
            System.out.println(profit);
        }
    }
}
