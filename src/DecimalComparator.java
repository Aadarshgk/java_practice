public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1*=1000;
        num2*=1000;
        if ((int) num1 == (int) num2) {
            return true;
        }else return false;
    }

}