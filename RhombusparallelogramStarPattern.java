//import java.util.Scanner;

public class RhombusparallelogramStarPattern {
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
         
        /* 
        //this code is take user input number.
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        

        for(int i = 1; i <= n; i++){
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        */
    }

}
