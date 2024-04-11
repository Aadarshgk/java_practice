import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i <= (sb.length() - 1) / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(i, backChar);
            sb.setCharAt(sb.length() - 1 - i, frontChar) ;
        }
        System.out.println("Output of reversal: " + sb);
    }
}
