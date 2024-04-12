import java.util.Scanner;

public class BubbleSort {
    public static void printAr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt(),a,temp;
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i]=in.nextInt();
        }
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        printAr(ar);

    }
}
