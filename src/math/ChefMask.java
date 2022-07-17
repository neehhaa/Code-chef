//Chef and Masks
package math;

import java.util.Scanner;

public class ChefMask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int dispMask = input.nextInt();
            int clothMask = input.nextInt();
            int dispMaskPrice = dispMask * 100;
            int clothMaskPrice = clothMask * 10;
            if (dispMaskPrice < clothMaskPrice){
                System.out.println("DISPOSABLE");
            } else if (dispMaskPrice > clothMaskPrice) {
                System.out.println("CLOTH");
            }
            else {
                System.out.println("CLOTH");
            }
        }
    }
}
