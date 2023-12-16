public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                if (row == 1 || row == number) {
                    for (int col = 0; col < number; col++) {
                        System.out.print("*");
                    }
                } else {
                    for (int col = 1; col <= number; col++) {
                        if (col == 1 || col == number) {
                            System.out.print("*");
                        } else {
                            if (row == col|| col== number-row+1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }

                }
                System.out.println();
            }
            }
    }

    public static void main(String[] args) {
        printSquareStar(6);
    }
}