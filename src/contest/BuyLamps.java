//Buy Lamps
package contest;

import java.util.Scanner;

public class BuyLamps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int quantity = input.nextInt();
            int redLamp = input.nextInt();
            int redCost = input.nextInt();
            int blueCost = input.nextInt();
            int blueLamp = quantity - redLamp;
            int cost = 0;
            if (redCost > blueCost) {
                cost = (redLamp * redCost) + (blueLamp * blueCost);
                System.out.println(cost);
            } else {
                System.out.println(quantity * redCost);
            }
        }
    }
}
