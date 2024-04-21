public class MergeSort {
    public static void merge(int[] ar, int low, int mid, int high) {
        int left=low, right=mid+1,x=0;
        int[] res = new int[high - low + 1];
        while (left <= mid && right <= high) {
            if (ar[left] <= ar[right]) {
                res[x++] = ar[left++];
            } else {
                res[x++] = ar[right++];
            }
        }
        while (left <= mid) {
            res[x++] = ar[left++];
        }
        while (right <= high) {
            res[x++] = ar[right++];
        }

        for (int i = 0, j = low; i < res.length; i++,j++) {
            ar[j] = res[i];
        }
    }

    public static void divide(int[] ar, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(ar, low, mid);
        divide(ar, mid + 1, high);
        merge(ar, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 3, 8, 1, 9, 0};
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}