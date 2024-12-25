package I_Datas;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
import java.util.Date;

public class TemporalAdjustersExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Data atual
        System.out.println("Hoje: " + today);

        // Primeiro dia do mês
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mês: " + firstDayOfMonth);

        // Último dia do mês
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês: " + lastDayOfMonth);

        // Próxima segunda-feira
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Próxima segunda-feira: " + nextMonday);

        // Última sexta-feira do mês
        LocalDate lastFriday = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("Última sexta-feira do mês: " + lastFriday);

        LocalDate lastSaturday = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
        System.out.println("Ultimo sabado : " +lastSaturday.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd-MM-YYYY");
        Date date = new Date();
        System.out.println(sdf.format(date));

        LocalDate nextThusday = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Proxima Quinta : "+nextThusday);

        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Proximo sabado : " +nextSaturday.toString());


    }
}
