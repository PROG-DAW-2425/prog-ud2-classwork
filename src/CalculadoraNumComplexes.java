
import java.math.BigDecimal;
import java.math.RoundingMode;

// Exemple:  x2 = -1   x = +- arrel -1    --> i = arrel de -1  (x = 0 + i, x = 0 - i)
public class CalculadoraNumComplexes {    
    // 3.51 + 1.4i
    private static final double PART_REAL_NUM1 = 3.5;  //3.5; //4.0;  
    private static final double PART_IMAGINARIA_NUM1 = 1.4; //1.4; //8.0;
    
    // 4.5 + 2.2i
    private static final double PART_REAL_NUM2 = 4.5;  //4.5; //7.0;    
    private static final double PART_IMAGINARIA_NUM2 = 2.2; //2.2; //19.0;
            
    
    public static void main(String[] args) {        
        
        StringBuilder dades = new StringBuilder();
        
        // Mostrem les dades dels dos números complexes
        dades.append("Part real del primer número complexe: ").append(PART_REAL_NUM1).append("\n");
        dades.append("Part imaginària del primer número complexe: ").append(PART_IMAGINARIA_NUM1).append("\n\n");
        
        dades.append("Part real del primer número complexe: ").append(PART_REAL_NUM2).append("\n");
        dades.append("Part imaginària del primer número complexe: ").append(PART_IMAGINARIA_NUM2).append("\n\n");
        
                       
        System.out.println(dades);
        
       
        // Creem els BigDecimal
        BigDecimal real1 = new BigDecimal(PART_REAL_NUM1);
        BigDecimal imag1 = new BigDecimal(PART_IMAGINARIA_NUM1);
        
        BigDecimal real2 = new BigDecimal(PART_REAL_NUM2);
        BigDecimal imag2 = new BigDecimal(PART_IMAGINARIA_NUM2);
        
        
        // Operacions aritmètiques
        
        // Suma dels dos números complexes: 
        // - part real de la suma: se sumen els components reals 
        // - part imaginària de la suma: se sumen els components imaginaris
        BigDecimal sumaReal = real1.add(real2);
        BigDecimal sumaImag = imag1.add(imag2);
        
 
        // Resta
        // igual que la suma pero restant
        BigDecimal restaReal = real1.subtract(real2); 
        BigDecimal restaImag = imag1.subtract(imag2); 
 
        // Multiplicació: s'aplica la propietat distributiva
        // (real1 + imag1i)*(real2 + imag2i) = (real1*real2) + (real1*imag2) + (imag1*real2) + (imag1*imag2*i*i)    
        // (--> i*i --> -1, perquè i és l'arrel quadrada de -1)
        // Multiplicació ====>  real1*real2 - imag1*imag2 + (real1*imag2 + imag1*real2)i
        BigDecimal multiplicacioReal = real1.multiply(real2).subtract(imag1.multiply(imag2)); 
        BigDecimal multiplicacioImag = real1.multiply(imag2).add(imag1.multiply(real2)); 
 
        
        // Divisió:  es multipliquen els dos números complexos pel conjugat 
        // del segon número complexe (aixina se'n va la part imaginària del denominador (queda anu·lada, queda un num real))
        // (real1+imag1i)*(real2-imag2i) / (real2+imag2i)*(real2-imag2i)
        
        // Exemple: (a + bi) / (c + di)
        // Fórmula després de simplificar: [(ac + bd) + (bc - ad)i] / (c*c + d*d)
       
  
        BigDecimal divisor = real2.multiply(real2).add(imag2.multiply(imag2));  
        
        BigDecimal divisioReal = real1.multiply(real2).add(imag1.multiply(imag2)).divide(divisor, 2, RoundingMode.HALF_EVEN);  
        // agafem, al menys 2 decimals: o es queda amb 0 decimals i si no hi arrodoniment donarà exception!!!
        // si els dos en tenen igual nombre de decimals queda a zero, pq es resten els digits decimals dels dos!!!!
        BigDecimal divisioImag = imag1.multiply(real2).subtract(real1.multiply(imag2)).divide(divisor, 2, RoundingMode.HALF_EVEN); // 
        
        
        // Creació de la cadena d'eixida 
        StringBuilder salida = new StringBuilder(); 
        salida.append("Suma: ").append(sumaReal.setScale(2, RoundingMode.HALF_UP)).append(" + ").append(sumaImag.setScale(2, RoundingMode.HALF_UP)).append("i\n"); 
        salida.append("Resta: ").append(restaReal.setScale(2, RoundingMode.HALF_UP)).append(" + ").append(restaImag.setScale(2, RoundingMode.HALF_UP)).append("i\n"); 
        salida.append("Multiplicació: ").append(multiplicacioReal.setScale(2, RoundingMode.HALF_UP)).append(" + ").append(multiplicacioImag.setScale(2, RoundingMode.HALF_UP)).append("i\n"); 
        salida.append("Divisió: ").append(divisioReal).append(" + ").append(divisioImag.setScale(2, RoundingMode.HALF_UP)).append("i\n"); 
 
        
        // Imprimim l'eixida 
        System.out.println(salida.toString()); 
        
        
    } 
}

// EXPLICACIÓ: HALF_EVEN (arrododit al parell més prop)
/*
La regla de HALF_EVEN és:

a. Si el/s dígits a arredonir són MAJOR que 5, arredonix cap amunt
b. Si el/s dígits a arredonir són MENOR que 5, arredonix cap avall
c. Si el dígit és EXACTAMENT 5, arredonix al número parell més proper

Exemples pràctics: (arredonim a 2 decimals)

2.125 → 2.12 (arredonix cap avall perquè 2.12 és parell)
2.135 → 2.14 (arredonix cap amunt perquè 2.13 és imparell)
2.145 → 2.14 (arredonix cap avall perquè 2.14 és parell)
2.155 → 2.16 (arredonix cap amunt perquè 2.15 és imparell)
2.1451 → 2.15 (com què 51 ja és major que 5 varrodonix cap amunt)

*/

// Ús en el món financer: En l'arredonir alternativament amunt/avall quan el dígit és 5
// es minimiza el error sistemàtic en grans conjunts de càlculs.
//