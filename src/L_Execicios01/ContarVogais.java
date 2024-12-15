package L_Execicios01 ; 
import java.util.Scanner;
public class ContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        System.out.println("\n");
        String frase = scanner.nextLine().toLowerCase();
        
        int contador = 0;
        for (char c : frase.toCharArray()) {
            if ("aeiouAEIOUÃÕíìÍÌEÈÉéè".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
        scanner.close();
    }
}

