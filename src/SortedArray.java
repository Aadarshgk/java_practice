public class SortedArray {
    public static boolean isSorted(int ar[], int idx) {
        if (idx == ar.length - 1) {
            return true;
        }

        if (ar[idx] < ar[idx + 1]) {
            return isSorted(ar, idx + 1);
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = {3, 1, 2, 34, 5};
        if(isSorted(ar, 0)){
            System.out.println("Array1 is sorted.");
        }else{
            System.out.println("Array1 is not sorted");
        }
        if (isSorted(ar2, 0)) {
            System.out.println("Array2 is sorted");
        } else {
            System.out.println("Array2 is not sorted");
        }
    }
}
