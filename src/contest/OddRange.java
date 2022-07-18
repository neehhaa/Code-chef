//Range Odd
package contest;

import java.util.Scanner;

public class OddRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for(int i = num1;i <= num2; i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
