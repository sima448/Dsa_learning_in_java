public class HollowStarPatternDiagonal {
    
    public static void main(String[] args) {
        int n = 5;

        for(int row = 0; row < n; row++){
            for(int star = 0; star < n; star++){
                if(row == 0 || row == n - 1 || star == 0 || star == n - 1
                    || row == star || row + star == n -1 
                ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }            
            }
            System.out.println();
        }
    }
}
