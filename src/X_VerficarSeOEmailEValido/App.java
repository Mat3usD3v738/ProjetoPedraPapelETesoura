package X_VerficarSeOEmailEValido;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email ;
        try {
            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$" ;
            System.out.println("Digite um email para verificarmos se e valido ou nao ");
            email = scanner.next();
            if (email.matches(regex)){
                System.out.println("Email Aprovado");
            }else if (!email.matches(regex)){
                System.out.println("Email Desaprovado");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO");
        }

    }
}
