package U_QuantidadesDeNumerosParesEntreDoisNumeros ;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, numerosPares = 0;
System.out.println("");
        System.out.println("Digite um número inteiro:");
        num1 = input.nextInt();

        System.out.println("Digite outro número inteiro:");
        num2 = input.nextInt();

        input.close();

        // Iterar entre os dois números
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {// Verifica se o número é par
                numerosPares++;
            }
        }

        System.out.println("A quantidade de números pares entre " + num1 + " e " + num2 + " é: " + numerosPares);
    }
}
