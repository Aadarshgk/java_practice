import java.util.Scanner;

public class SelectSort {

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
        for (int i = 0; i < ar.length - 1; i++) {
            int smallest=i,temp;
            for(int j=i+1;j< ar.length;j++){
                if (ar[smallest] > ar[j]) {
                    smallest=j;
                }
            }
            temp=ar[i];
            ar[i] = ar[smallest];
            ar[smallest] = temp;
        }
        printAr(ar);
    }
}
