import java.util.*;
public class SolidRectangle {
    public static void olidRectangle(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Enter the number of rows and columns");
        int a= in.nextInt();
        int b= in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
