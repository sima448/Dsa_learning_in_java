import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();

        int width = (int) Math.ceil(m / (a * 1.0));
        int height = (int) Math.ceil(n / (a * 1.0));

        System.out.println(width * height);

    }
}
