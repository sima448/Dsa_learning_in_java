//package sep10;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {10, 20, 70, 40, 50, 60};
        int Max = arr[0];
        int Min = arr[0];
       int maxindex=0;
       int minindex=0;

        


        for(int i = 1; i < arr.length; i++){
            if(arr[i] > Max) {
                Max = arr[i];
                maxindex=i;

            }
            if(arr[i] < Min){
                Min = arr[i];
                minindex=i;

            } 
        }
        int temp = arr[maxindex];
        arr[maxindex] = arr[minindex];
        arr[minindex] = temp;

        //System.out.println(Max);
        //System.out.println(Min);
        // System.out.println(te);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ "  ");
        }

    }
}
