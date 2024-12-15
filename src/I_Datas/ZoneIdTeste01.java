package I_Datas ;
import java.time.*;
import java.util.*;
public class ZoneIdTeste01 {
public static void main(String[] args) {

   Map<String,String>  ids =  ZoneId.SHORT_IDS;
   Instant nowInstant = Instant.now() ; 
ZoneId zona = ZoneId.of("Europe/Lisbon");

   nowInstant.atZone(zona);
/*    System.out.println(zona);
 */   System.out.println(nowInstant);

 System.out.println("Mapa : "+'\n');
 System.out.println(ids);

}
}
