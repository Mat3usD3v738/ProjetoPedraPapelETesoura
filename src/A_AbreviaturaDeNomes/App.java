package A_AbreviaturaDeNomes;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome completo do usuário
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        // Divide o nome completo em partes
        String[] partesDoNome = nomeCompleto.split(" ");

        // Verifica se há mais de uma parte no nome
        if (partesDoNome.length > 1) {
            String primeiroNome = partesDoNome[0];
            String ultimoNome = partesDoNome[partesDoNome.length - 1];
            StringBuilder nomeAbreviado = new StringBuilder(primeiroNome);

            // Abrevia os nomes do meio
            for (int i = 1; i < partesDoNome.length - 1; i++) {
                nomeAbreviado.append(" ").append(partesDoNome[i].charAt(0)).append(".");
            }

            // Adiciona o último nome
            nomeAbreviado.append(" ").append(ultimoNome);

            // Exibe o nome abreviado
            System.out.println("Nome abreviado: " + nomeAbreviado);
        } else {
            // Caso o nome tenha apenas uma parte
            System.out.println("Nome abreviado: " + nomeCompleto);
        }

        scanner.close();
    }
}
