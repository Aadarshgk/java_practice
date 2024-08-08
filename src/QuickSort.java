public class QuickSort {
    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static int partition(int[] ar, int low, int high) {
        int pivot = ar[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (ar[j] < pivot) {
                i++;
                swap(ar,j,i);
            }
        }
        i++;
        swap(ar, high, i);
        return i;
    }

    public static void quickSort(int[] ar, int low, int high) {
        if (low < high) {
            int index = partition(ar, low, high);
            quickSort(ar, low, index - 1);
            quickSort(ar,index+1,high);
        }
    }


    public static void quickSort1(int[] ar, int low, int high) {
        if(low<=high){
            int pivot=low;
            int i = low + 1, j = high;
            while (i <= j) {
                while (i <= high && ar[i]<= ar[pivot]) {
                    i++;
                }
                while (j > low && ar[j] > ar[pivot]) {
                    j--;
                }
                if (i <= j) {
                    swap(ar, i, j);
                }
            }
            swap(ar,j,pivot);
            quickSort1(ar, low, j - 1);
            quickSort1(ar, j + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] ar = {6, 2, 7, 3, 8, 9};
        quickSort1(ar, 0, ar.length - 1);
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.println( );
    }
}
