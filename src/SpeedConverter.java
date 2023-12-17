public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(-5.6);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double mph=  kilometersPerHour/ 1.609;
            return Math.round(mph);
        }
    }
    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        if (mph == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour+" km/h = "+ mph + " mi/h");
        }

    }
}
