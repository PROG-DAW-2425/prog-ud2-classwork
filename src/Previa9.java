
import java.time.LocalDateTime;


// Crea un programa que mostre la data i l'hora actual del sistema, 
// així com mostrar només l'any, el mes i el dia.


public class Previa9 {
    
    public static void main(String[] args) {
        
        LocalDateTime dataHoraActual = LocalDateTime.now();        
        
        System.out.println("La data i l'hora del sistema és: " + dataHoraActual);
        System.out.println("Dia: " + dataHoraActual.getDayOfMonth());
        System.out.println("Mes: " + dataHoraActual.getMonthValue());
        System.out.println("Any: " + dataHoraActual.getYear());
        
    }
    
}