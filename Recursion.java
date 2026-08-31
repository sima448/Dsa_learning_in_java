public class Recursion {
    static void printName(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printName(n - 1);
        System.out.println(n);



    }
    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }

    
}

/*
public class Recursion {
    static void printName(int n){
        if(n == 0){
            return;
        }
        printName(n - 1); 
        System.out.println(n);//1, 2, 3, 4, 5



    }
    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }

    
}

*/

/*
public class Recursion {
    static void printName(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);// 5, 4, 3,2,1
        printName(n - 1); 



    }
    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }

    
}

*/