//package aug22;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 17;
        boolean flag = true;

        for (int i = 2; i < n; i++){
            if(n % i == 0) {
                flag = false;
                break;
            }
        }

        if  (flag){
            System.out.println("Number is prime");
            
        } else {
            System.out.println("Number is not prime");
        }

}
         
















      
}
    

