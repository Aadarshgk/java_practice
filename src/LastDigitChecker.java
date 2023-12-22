public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 0 || a > 1000) || (b < 0 || b > 1000) || (c < 0 || c > 1000)) {
            return false;
        } else {
            if ((a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
