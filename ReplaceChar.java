public class ReplaceChar {
    static String replace(String str, char toReplace, char replaceWith){
        if(str.equals("")){
            return "";
        }
        String result = replace(str.substring(1), toReplace, replaceWith);
        if(str.charAt(0) == toReplace) {
            result = replaceWith + result;
            
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
        }