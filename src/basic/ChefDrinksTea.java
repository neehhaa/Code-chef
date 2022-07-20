//Chef Drinks Tea
package basic;

import java.util.Scanner;

public class ChefDrinksTea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while(testcase-->0) {
            int dailyIntake = input.nextInt();
            int jarCapacity = input.nextInt();
            int teaPrice = input.nextInt();


            if (dailyIntake <= jarCapacity){
                if (dailyIntake == 1){
                    System.out.println(teaPrice);

                }else {
                    int refill = jarCapacity / dailyIntake;
                    int price = teaPrice * refill;
                    System.out.println(price);
                }

                }

            else {
                int refill = dailyIntake/jarCapacity;
                if(dailyIntake%jarCapacity != 0){
                    refill = refill+1;
                }
                int price = refill * teaPrice;
                System.out.println(price);
            }

        }
    }
}
//test for 1 2 1 ; 1 1 2; 2 4 1