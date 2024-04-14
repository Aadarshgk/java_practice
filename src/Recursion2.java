import java.util.HashSet;

public class Recursion2 {
    public static void subsequences(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        subsequences(str,idx+1, combination+ str.charAt(idx));
        subsequences(str,idx+1, combination);
    }

    public static void uniqueSubsequence(String str, int idx, String combination, HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(combination)){
                return;
            }

            System.out.println(combination);
            set.add(combination);
            return;
        }
        uniqueSubsequence(str,idx+1, combination+ str.charAt(idx),set);
        uniqueSubsequence(str, idx + 1, combination, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
//        subsequences(str, 0, "");
        uniqueSubsequence(str, 0, "",set);
    }
}
