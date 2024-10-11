//Activitat 5 - Utilitza els objectes creats en la activitat 4 per a cridar els següents
// mètodes d'instancia de String i comprovar que el valor obtingut en cada cridada amb 
// cada objecte és el valor esperat:
//  length()
//  indexOf(String)
//  strip()
//  isEmpty()


public class Previa5 {

    private static String s5;

    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1 = " + s1);
        
        String s2 = new String("string2");
        System.out.println("s2 = " + s2);
        
        String s3 = new String();
        System.out.println("s3 = " + s3);
        
        String s4 = new String(" string4 ");
        System.out.println("s4 = " + s4);
        
        
        //String s5;   // dóna error, s5 no està inicialitazada
        
        System.out.println("s5 = " + s5);   // = null

        
        System.out.println("s1: length -> " + s1.length());
        System.out.println("s1: indexOf 'tring'  -> " + s1.indexOf("tring"));
        System.out.println("s1: strip  -> " + s1.strip());
        System.out.println("s1: isEmpty -> " + s1.isEmpty());
        System.out.println();

        System.out.println("s2: length -> " + s2.length());
        System.out.println("s2: indexOf 'tring'  -> " + s2.indexOf("tring"));
        System.out.println("s2: strip  -> " + s2.strip());
        System.out.println("s2: isEmpty -> " + s2.isEmpty());
        System.out.println();

        System.out.println("s3: length -> " + s3.length());
        System.out.println("s3: indexOf 'tring'  -> " + s3.indexOf("tring"));
        System.out.println("s3: strip  -> " + s3.strip());
        System.out.println("s3: isEmpty -> " + s3.isEmpty());
        System.out.println();

        System.out.println("s4: length -> " + s4.length());
        System.out.println("s4: indexOf 'tring'  -> " + s4.indexOf("tring"));
        System.out.println("s4: strip  -> " + s4.strip());
        System.out.println("s4: isEmpty -> " + s4.isEmpty());
        System.out.println();

        System.out.println("s5: length -> " + s5.length());
        System.out.println("s5: indexOf 'tring'  -> " + s5.indexOf("tring"));
        System.out.println("s5: strip  -> " + s5.strip());
        System.out.println("s5: isEmpty -> " + s5.isEmpty());
        System.out.println();

       
    }

}
