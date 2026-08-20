package aug18;
public class BillElectricity {
     
    public static void main(String[] args) {
     int bill = 0;
     int units = 456;
     
     if(units <= 100)
      bill = 0;
     else if (units <= 200)
      bill = (units - 100) * 5;
     else
      bill = (100 * 5) + (units - 200) * 10;
     System.out.println(bill);
   
    } 
        
    
   
}
