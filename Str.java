public class Str {
    
    public static void main(String[] args){
        String s = new String("Sima");// heap memory
        String s1 = "Sima";// string pool
        String s2 = "Sima";
        System.out.println(s == s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //Immutable ==> can Not Modify

        //mutable ==> 

    }
}
