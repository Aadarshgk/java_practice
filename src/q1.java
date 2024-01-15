import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=1,sum=0,num;
        while(count<=5){
            try {
                System.out.print("Enter number #" + count+": ");
                num= in.nextInt();
                sum+=num;
                count++;
            }catch(Exception e){
                System.out.print("Invalid number");
            }
        }
        System.out.println("The sum is:"+sum);

    }
}
