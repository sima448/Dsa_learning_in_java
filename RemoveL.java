public class RemoveL {
    //method 1
    static String replace(String str, char toReplace, char replaceWith){
        if(str.equals("")){
            return "";
        }
        String result = replace(str.substring(1), toReplace, replaceWith);
        if(str.charAt(0) == toReplace) {
            result = "" + result;
            
        } else{
            result = str.charAt(0) + result;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "HELLO";
        char toReplace = 'L';
        char replaceWith = 'X';
        System.out.println(replace(str, toReplace, replaceWith));
    }
    

    /*
    //method 2
    static String removeL(String str){
        if(str.equals("")) {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'L') {
            return removeL(str.substring(1));
        }
        return ch + removeL(str.substring(1));
    }
    
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println(removeL(str));
    }
    */
}
