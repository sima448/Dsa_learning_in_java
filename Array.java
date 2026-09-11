//package sep10;
public class Array {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int even = 0;
        int odd = 0;
        
        /*
        //print all
        for(int i = 0; i < arr.length; i++) {
            System.out.println((arr[i]));
        }
        
        // sum
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
        */
       for(int i = 0; i < arr.length; i++) {
        if(arr[i]%2==0){
            even = even+arr[i];
        } else {
            odd = odd+arr[i];
        }
        }
        System.out.println(even);
        System.out.println(odd);
        
    }
}
