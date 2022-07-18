//Chef and Instant Noodles
package math;

import java.util.Scanner;

public class Noodles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stoves = input.nextInt();
        int minutes = input.nextInt();
        System.out.println(stoves*minutes);
    }
}