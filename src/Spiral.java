import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int row_max = rows-1;
        int cols_max= cols-1;
        int row_min =0;
        int cols_min=0;
        while (row_min <= row_max && cols_min <= cols_max) {
            for (int i =cols_min; i <= cols_max; i++) {
                System.out.print(mat[row_min][i]+" ");
            }
            row_min++;

            for (int i = row_min; i <= row_max; i++) {
                System.out.print(mat[i][cols_max]+" ");
            }
            cols_max--;

            for (int i = cols_max; i >= cols_min; i--) {
                System.out.print(mat[row_max][i] + " ");
            }
            row_max--;

            for (int i = row_max; i >= row_min; i--) {
                System.out.print(mat[i][cols_min]+" ");
            }
            cols_min++;
        }
    }
}
