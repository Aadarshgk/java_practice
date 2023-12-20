public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number>=0){
            int sum=number%10;
            while(number>9){
                number/=10;
            }
            sum+=number;
            return sum;
        }
        return -1;
    }
}