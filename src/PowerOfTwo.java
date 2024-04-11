import java.util.Scanner;

public class PowerOfTwo {
    public void isPowerOfTwo() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), count = 0;
        while (a > 0) {
            if ((a & 1) == 1) {
                count++;
            }
            a= a>>1;
        }
        if (count == 1) {
            System.out.println("The number is in power of 2");
        } else {
            System.out.println("The number is not in powers of 2");
        }
    }
}
