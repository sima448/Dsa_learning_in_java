public class ReverseRecursion {
    static void rev(int n, int rev){
        if(n == 0){
            System.out.println(rev);
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
        rev(n, rev);
       
    }
    public static void main(String[] args) {
        int n = 12345;
        rev(n, 0);
    }
    
}
