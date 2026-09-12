//package sep10;
import java.util.ArrayList;
import java.util.Collections;

public class LeaderElement {
     public static void main(String[] args) {
         ArrayList<Integer> ans = new ArrayList<>();
          int max = Integer.MIN_VALUE;
        int arr[] = {8, 17, 24, 23, 5, 2};

        for(int i = arr.length - 1; i >= 0; i--){
          if(arr[i] >= max){
               ans.add(arr[i]);
               max = arr[i];
          }
        }
        Collections.reverse(ans);
        System.out.println(ans);
     }
}
