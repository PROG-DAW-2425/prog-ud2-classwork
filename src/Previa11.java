/*

Crea un programa que mostre l'hora actual a les zones horàries següents.
         - Europe/Madrid
         - Africa/Cairo
         - Europe/London
    Exemple execució
        L'hora a Europe/Madrid és 09:19:29
        L'hora a Africa/Cairo és 10:19:29
        L'hora a Europe/London és 08:19:29

*/


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Previa11 {
    static String ZONE_ID_MADRID = "Europe/Madrid";
    static String ZONE_ID_CAIRO = "Africa/Cairo";
    static String ZONE_ID_LONDON = "Europe/London";
   
    
    public static void main(String[] args) {
        
        LocalTime localTimeMadrid = LocalTime.now(ZoneId.of(ZONE_ID_MADRID));
        LocalTime localTimeCairo = LocalTime.now(ZoneId.of(ZONE_ID_CAIRO));
        LocalTime localTimeLondon = LocalTime.now(ZoneId.of(ZONE_ID_LONDON));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
      
        System.out.println("L'hora a " + ZONE_ID_MADRID + " és: " + localTimeMadrid.format(formatter));
        System.out.println("L'hora a " + ZONE_ID_CAIRO + " és: " + localTimeCairo.format(formatter));
        System.out.println("L'hora a " + ZONE_ID_LONDON + " és: " + localTimeLondon.format(formatter));
        
   

    }
    
}
