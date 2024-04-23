public class QuickSort {
    public static void swap(int ar[], int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static int partition(int ar[], int low, int high) {
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

    public static void quickSort(int ar[], int low, int high) {
        if (low < high) {
            int index = partition(ar, low, high);
            quickSort(ar, low, index - 1);
            quickSort(ar,index+1,high);
        }
    }

    public static void main(String[] args) {
        int[] ar = {6, 2, 7, 3, 8, 9};
        quickSort(ar, 0, ar.length - 1);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
