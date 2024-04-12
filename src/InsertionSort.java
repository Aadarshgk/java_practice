import java.util.Scanner;

public class InsertionSort {
    public static void printAr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = in.nextInt();
        }

        for (int i = 1; i < ar.length; i++) {
            int cur = ar[i];
            int j=i-1;
            while (j >= 0 && cur < ar[j]) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = cur;
        }
        printAr(ar);
    }
}
