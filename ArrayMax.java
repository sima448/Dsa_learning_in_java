//package sep10;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8};
        int Max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > Max){
               Max = arr[i];
            }
        }
        System.out.println(Max);
    } 
}
