import java.util.Scanner;

public class ToggleBit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int newNumber;
        int pos = in.nextInt();
        int bitMask= 1<<(pos-1);
        if ((a & bitMask) == 0) {
            newNumber = a | bitMask;
        } else {
            int newMask = ~(bitMask);
            newNumber= a & newMask;
        }
        System.out.println(newNumber);
    }
}
