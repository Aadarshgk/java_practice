import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % a < 2) {
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= b; j++) {
                    if (j == 1 || j == b) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
