import java.util.Scanner;

public class Politics {
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] opinions = new String[n];
        for (int i = 0; i < n; i++){
            opinions[i] = sc.next();

        }
        String me = opinions[0];
        int remaining = 1;

        for(int i = 1; i < n; i++){
            if(opinions[i].equals(me)){
                remaining++;
            }
        }
         System.out.println(remaining);
         t--;
      }
     }

}
