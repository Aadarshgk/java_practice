public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number*=-1;
        }
        int temp = number, sum=0;
        while (temp > 0) {
            sum = (sum*10)+ (temp % 10);
            temp/=10;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }


}
