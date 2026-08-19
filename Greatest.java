public class Greatest {

    public static void main(String[] args){
        int a = 20;
        int b = 10;
        int c = 45;


        /* 
        // conditonal comparision 
        if ( a >= b && a >= c){
        System.out.println("greatest A");

        } else if (b >= a && b >= c){
        System.out.println("greatest B");
   
        }else {
        System.out.println("greatest C");
        }
       */
        //ternary operator used ki he
        int greatest = (a > b)? ((a > c) ? a : c): ((b > c)? b : c);
        System.out.println(greatest);


        
    }
    
}
