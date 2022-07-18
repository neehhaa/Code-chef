//The Mango Truck
package math;

import java.util.Scanner;

public class MangiTruck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-- > 0) {
            int mango = input.nextInt();
            int truck = input.nextInt();
            int canWithstand = input.nextInt();

            int remain = canWithstand - truck;
            int mangoes = remain / mango;
            System.out.println(mangoes);

        }
    }
}
