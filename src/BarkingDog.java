public class BarkingDog {
    public static void main(String[] args) {
        boolean n=shouldWakeUp(true, 4);
        if (n) {
            System.out.println("ture");
        }else{
            System.out.println("false");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;

    }
}
