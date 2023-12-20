public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int temp,temp2;
            while (a > 0) {
                temp = a % 10;
                temp2=b;
                while (temp2 > 0) {
                    if (temp == (temp2 % 10)) {
                        return true;
                    }

                    temp2/=10;
                }
                a/=10;
            }
            return false;
            }
        return false;
    }

}



