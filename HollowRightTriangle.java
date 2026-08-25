public class HollowRightTriangle {
    public static void main(String[] args){
        int n = 5;

       for(int row = 1; row <= n; row++){
            for(int star = 1; star <= row ;star++){
                if(row == 1 || row == n ||star == 1 || star == row){
              System.out.print("*");
            } else {
                System.out.print(" ");

            }
        }
        System.out.println();
    }
  }
}
