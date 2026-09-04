public class RecursivePower{
    static int power(int num, int exp){
     if(exp == 0){
        return 1;
     }
       return  num * power(num, exp - 1);
    }

    
    public static void main(String[] args) {
        int num = 3;
        int exp = 3;
        System.out.println(power(num, exp));

    }
}
