//Buy Please

package contest;
import java.util.Scanner;
public class BuyPlease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pen = input.nextInt();
        int pencil = input.nextInt();
        int penPrice = input.nextInt();
        int pencilPrice = input.nextInt();
        int total = (pen*penPrice)+(pencil*pencilPrice);
        System.out.println(total);
    }
}
