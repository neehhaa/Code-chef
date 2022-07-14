package basic;

import java.util.Scanner;
public class Flow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        while (testCase-- > 0){
            int Num1 = scan.nextInt();
            int Num2 = scan.nextInt();
            int Addition = Num1 + Num2;
            System.out.println(Addition);
        }
    }
}
