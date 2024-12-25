package I_Datas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class YearsOld {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            LocalDate now = LocalDate.now();
            int mes, ano, dia;
            long anosDeIdade;


            LocalDate aniversario = null;
            System.out.println("Digite o ano que voce nasceu");
            ano = in.nextInt();
            System.out.println("Digite o mes que voce nasceu");
            mes = in.nextInt();
            System.out.println("Digite o dia que voce nasceu");
            dia = in.nextInt();
            in.close();

            aniversario = LocalDate.of(ano, mes, dia);
            anosDeIdade = ChronoUnit.YEARS.between(aniversario, now);
            System.out.println("voce tem " + anosDeIdade + " anos");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("erro");
        } catch (DateTimeException e) {
            e.printStackTrace();
            System.out.println("Data errada");
        }


    }
}
