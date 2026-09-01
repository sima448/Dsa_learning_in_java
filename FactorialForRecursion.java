public class FactorialForRecursion {
    /*
    //method 1 (tail recursion)
    static void fact(int n, int fact){
        if( n == 1) {
            System.out.println(fact);
            return;
        }
        fact(n-1, n* fact);
    }
    public static void main(String[] args) {
        int n = 5;
        fact(n, 1);
    }
    */
    //method 2
    static int fact(int n){
       if(n == 1){
        return 1;
       }
       return n * fact(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
       System.out.println(fact(n));
    }
}
