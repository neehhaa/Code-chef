//Expiring Bread
package math;

import java.util.Scanner;

public class ExpireBread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int loaves = input.nextInt();
            int expire = input.nextInt();
            int canEat = input.nextInt();

            int eat = expire * canEat;
            if (eat >= loaves){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
