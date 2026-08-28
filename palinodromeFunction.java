public class palinodromeFunction {
    static boolean palindrome(int n){
        
        int Original = n;
        int rev = 0;

        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return Original == rev;
    }
    public static void main(String[] args) {
     System.out.println(palindrome(500001));

    }

}


/* 
public class Palindrome {
    static Boolean ispalindrome(int num){
        int original = num;
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome(323721));
    }
}
*/