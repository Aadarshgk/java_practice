import java.util.Scanner;

public class CountBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n= n>>1;
        }
        System.out.println("Count of 1s: "+ count);
    }
}
