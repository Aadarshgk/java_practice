public class FindOccurance {
    public static int first= -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char letter) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)== letter){
            if (first == -1) {
                first=last=idx;
            }else {
                last = idx;
            }
        }
        findOccurance(str,idx+1,letter);
    }

    public static void main(String[] args) {
        findOccurance("abaacdaefaah",0,'a');
    }
}
