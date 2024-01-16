import java.util.*;
public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum=0,avg=0,count=0,num;
        double temp;
        String x;
        boolean flag= false;
        while (!flag) {
            x= scanner.nextLine();
            try{
                num= Integer.parseInt(x);
                count++;
                sum+=num;
                temp= Math.round((double)sum/count);
                avg= (int)temp;
            }catch (NumberFormatException e){
                System.out.println("SUM = "+sum+" AVG = "+avg);
                flag=true;
            }

        }
    }
}
