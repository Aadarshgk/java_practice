import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] ar= new boolean[n+1];
        Arrays.fill(ar, true);
        ar[0]=ar[1]=false;
        for(int i=2;i<=n;i++){
            if(ar[i]){
                for(int j=i*i;j<=n;j+=i){
                    ar[j] = false;
                }
            }
        }
        System.out.println("Prime factors: ");
        for(int i=2;i<=n;i++){
            if(ar[i]){
                System.out.print(i+" ");
            }
        }
    }
}
