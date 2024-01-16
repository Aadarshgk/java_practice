import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=1,sum=0,num;
        String x;
        while(count<=5){
            System.out.print("Enter number #" + count + ": ");
            x = in.nextLine();
            try {
                num= Integer.parseInt(x);
                sum+=num;
                count++;
            }catch(NumberFormatException e){
                System.out.print("Invalid number\n");
            }
        }
        System.out.println("The sum is:"+sum);

    }
}
