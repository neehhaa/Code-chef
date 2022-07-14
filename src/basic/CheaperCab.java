package basic;

import java.util.Scanner;
public class CheaperCab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T-- > 0){
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (X>Y){
                System.out.println("SECOND");
            } else if (Y>X) {
                System.out.println("FIRST");
            }
            else {
                System.out.println("ANY");
            }
        }
    }
}
