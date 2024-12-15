package L_Execicios01 ;
import java.util.Scanner;
/*Conversor de c para f  */
public class ConvensorDeTemperatura {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("____________________________________");
  System.out.println("\n");
  System.out.print("Digite a temperatura em celsius em será escrito na tela a temperatura em fahrenheit");
    double celsius = input.nextDouble();
    double fahrenheit = Conversor(celsius);
    System.out.println("\n");
    System.out.println("A temperatura e celsius é " +celsius+ " e em fahrenheit é " +fahrenheit);
    System.out.println("\n");
    System.out.println("____________________________________");
input.close();
}

public static double Conversor(double celsius){

    return (celsius * 9/5) + 32;
}
}
