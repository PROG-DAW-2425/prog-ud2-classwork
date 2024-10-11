
/*

Crea un programa que, a partir de:
Una data i hora amb un format de data de 4 dígits per a l'any, una barra, 2 dígits per al mes, una barra, 2 dígits per al dia i un format d'hora de 2 dígits per l'hora en format 24 hores, dos punts, 2 dígits per als minuts, dos punts, dos dígits per als segons (p.e: 2021/12/12 10:30:21) 

La mostre en format similar per canviant la posició de l'any per el dia i viceversa (p.e: 12/12/2021 10:30:21)

EXEMPLE:
Data de entrada en el format indicat:
2021/02/12 15:30:10

Data de sortida en el format indicat:
12/02/2021 15:30:10


*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Previa10 {
    
    static String DATA_HORA_12H_PM = "2024/12/12 03:30:10 p. m.";
    static String DATA_HORA_12H_AM = "2024/12/12 01:30:10 a. m.";
    static String DATA_HORA_24H = "2024/12/12 15:30:10";
    
    // patterns
    static String PATTERN_12H_AM_PM = "yyyy/MM/dd hh:mm:ss a";
    static String PATTERN_24H_YYYY_MM_DD = "yyyy/MM/dd HH:mm:ss";
    static String PATTERN_24H_DD_MM_YYYY = "dd/MM/yyyy HH:mm:ss";
    
        
    
    public static void main(String[] args) {
        
        final String dataHoraCadena = DATA_HORA_24H;       
       
        // format d'entrada
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern(PATTERN_24H_YYYY_MM_DD);        
        // format de sortida
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern(PATTERN_24H_DD_MM_YYYY);
        
        
        // creeem la data i hora, validant l'String al primer format
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraCadena, dateTimeFormatter1);
        
        // imprimim tot
        System.out.println("Data d'entrada en el format indicat: " + dataHora.format(dateTimeFormatter1));
        System.out.println("Data de sortida en el format indicat: " + dataHora.format(dateTimeFormatter2));
        
    }
}
