import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
