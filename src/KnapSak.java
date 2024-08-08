import java.util.ArrayList;
import java.util.List;

public class KnapSak {
    static int [][] ar;
    public static void knapsak(int[] profit, int[] weight, int w) {
        int row= weight.length+1;
        ar = new int[profit.length + 1][w + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    ar[i][j] =0;
                } else if ( weight[i - 1] <= j) {
                    ar[i][j] = Math.max(profit[i - 1] + ar[i - 1][j - weight[i - 1]], ar[i - 1][j]);
                } else {
                    ar[i][j] = ar[i - 1][j];
                }
            }
        }
    }

    public static void item(List<Integer> res,int maxProfit,int[] profit,int[] weight) {
        int row = ar.length;
        int col = ar[0].length-1;
        int i = row - 1;
        while (i > 0 && maxProfit>0) {
            if(ar[i][col]!=ar[i-1][col]){
                res.add(i);
                maxProfit -= profit[i - 1];
                col-= weight[i-1];
            }
            i--;
        }
    }


    public static void main(String[] args) {
        int[] profit= {10,20,50,60};
        int[] weight = {2,3,4,5};
        int w = 8;
        ArrayList<Integer> res = new ArrayList<>();
        knapsak(profit, weight, w);
        int maxProfit = ar[profit.length][w];
        System.out.println("The maximum profit is: " + maxProfit);
        item(res, maxProfit, profit,weight);
        System.out.println("The items to included are: ");
        for (int a : res) {
            System.out.print(a + " ");
        }
    }
}
