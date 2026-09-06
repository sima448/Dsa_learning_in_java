public class RevString {
    static String reverse(String str) {
        if(str.equals("")) {
            return "";
        }
        String result = reverse(str.substring(1));
            result += str.charAt(0);
            return result;
    }
    
    public static void main(String[] args) {
        String str = "Yesh";
        System.out.println(reverse(str));
        
    }


}

/*
static void reverse(String str, int i, String result) {
    if(i < 0){
        System.out.println(result);
        return;
    }
    reverse(str, i - 1, result + str.charAt(i));
}
public static void main(String[] args) {
    String str = "Yesh";
    reverse(str, str.length() - 1, "");
    
}
*/
