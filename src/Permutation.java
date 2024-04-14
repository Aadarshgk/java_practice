public class Permutation {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation+current);
        }
    }

    public static void main(String[] args) {
        printPerm("abc","");
    }
}
