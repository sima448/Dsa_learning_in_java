
public class Reverse {
    public static void main(String[] args) {
    int nums = 12345;
    int rev = 0;

    while(nums > 0) {
        int digit =  nums % 10;
        rev = rev * 10 + digit;
        nums = nums / 10; 
    }
     System.out.println("Reverse Number: " + rev);

       
    }
}
