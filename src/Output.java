import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Output {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=in.nextInt();
        int[] profit=new int[n];
        int[] weight= new int[n];
        System.out.println("Enter max weight of KanpSack:");
        int w=in.nextInt();
        int[][] ar= new int[n+1][w+1];
        System.out.println("Enter profit and weight:");
        for(int i=0;i<n;i++){
            System.out.println("Enter profit:");
            profit[i]=in.nextInt();
            System.out.println("Enter weight:");
            weight[i]=in.nextInt();
        }
        maxKnapSack(ar,profit,weight,n,w);
        int maxValue=ar[n][w];
        System.out.println("The maximum profit is: "+ar[n][w]);
        List<Integer> item= new ArrayList<>();
    }

    public static void maxKnapSack(int[][] ar, int[] profit, int[] weight,int n, int w){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0 || j==0){
                    ar[i][j]=0;
                }else if(weight[i-1] <= j){
                    ar[i][j]= Math.max(ar[i-1][j],profit[i-1]+ar[i-1][j-weight[i-1]]);
                }else{
                    ar[i][j]=ar[i-1][j];
                }
            }
        }
    }
}