// Activitat 6 - On es fa autoboxing i on es fa autounboxing?
// Són les sentencies correctes? 
/*
Integer x = 3 + new Integer(5);
Integer x = 3;
Double x = 3;
Double x = 3.0;
int x = new Integer(3);
int x = new Integer(3) + new Integer(4);

*/



public class Previa6 {

    public static void main(String[] args) {
        // boxing
        Integer x = 3 + Integer.valueOf(5);
       
        Integer x2 = 3;
        
        //Double x3 = 3;  // incorrecta!!
        Double x3 = Double.valueOf(3);  // correcta!!
        
        Double x4 = 3.0;
        
        
       
        // unboxing (previ boxing)
        int x5 = new Integer(3);
        
        int x6 = new Integer(3) + new Integer(4);
        
        
    }
}
