//Apples and Oranges
package math;

import java.util.Scanner;

public class ApplenOranges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();
        int apple = input.nextInt();
        int orange = input.nextInt();
        int fruits = apple + orange;
        if (money >= fruits){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
