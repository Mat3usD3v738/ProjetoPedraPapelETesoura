package L_Execicios01 ;
import java.util.Scanner;
public class ContagemDeHoras {
  public static void main(String[] args) {
    System.out.println("__________________________________________________");
    System.out.println("\n");
       long dias ;
       float horas ; 
       Scanner input = new Scanner(System.in);
       System.out.println("Digite o numero de dias que mostraremos o numero de horas");
       dias =  input.nextLong();
       input.close(); 
       horas = (float) dias * 24  ;
       System.out.println("o numero de horas em " +dias+ " dias é : " +horas+ " horas ");
       System.out.println("\n");
       System.out.println("__________________________________________________");

    }
}
