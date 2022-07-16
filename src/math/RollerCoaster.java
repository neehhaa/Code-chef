//Roller Coaster
package math;

import java.util.Scanner;
public class RollerCoaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int sonHeight = input.nextInt();
            int reqHeight = input.nextInt();

            if (sonHeight >= reqHeight){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
