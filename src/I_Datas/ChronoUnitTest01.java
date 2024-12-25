package  I_Datas ;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        // 1. Diferença entre duas DATAS (apenas ano, mês e dia)
         //LocalDate now = LocalDate.now() ;
        LocalDate startDate = LocalDate.of(2024, 1, 1); // Data inicial: 1º de janeiro de 2024
        LocalDate endDate = LocalDate.of(2024, 12, 31); // Data final: 31 de dezembro de 2024

        // Calcula o número de dias entre as duas datas
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Dias entre " + startDate + " e " + endDate + ": " + daysBetween);

        // Calcula o número de meses entre as duas datas
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("Meses entre " + startDate + " e " + endDate + ": " + monthsBetween);

        // 2. Diferença entre dois HORÁRIOS (ano, mês, dia, hora, minuto)
        LocalDateTime startTime = LocalDateTime.of(2024, 12, 22, 8, 30); // 22 de dezembro de 2024, 8:30 AM
        LocalDateTime endTime = LocalDateTime.of(2024, 12, 22, 18, 45);  // 22 de dezembro de 2024, 6:45 PM

        // Calcula o número de horas entre os horários
        long hoursBetween = ChronoUnit.HOURS.between(startTime, endTime);
        System.out.println("Horas entre " + startTime + " e " + endTime + ": " + hoursBetween);

        // Calcula o número de minutos entre os horários
        long minutesBetween = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println("Minutos entre " + startTime + " e " + endTime + ": " + minutesBetween);

        // 3. Diferença entre duas datas (em anos)
        long yearsBetween = ChronoUnit.YEARS.between(startDate, endDate.plusYears(1)); // Adiciona 1 ano na data final
        System.out.println("Anos entre " + startDate + " e " + endDate.plusYears(1) + ": " + yearsBetween);
    }
}
