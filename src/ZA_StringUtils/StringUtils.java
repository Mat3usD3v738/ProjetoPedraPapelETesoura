package ZA_StringUtils;


import java.awt.*;
import java.util.Scanner;

public class StringUtils {
    @org.jetbrains.annotations.NotNull
    public static long contarLetras(String x){
        return  x.toCharArray().length;
    }
    @org.jetbrains.annotations.NotNull
    public static  String inverterString(String x){
        StringBuilder palavraInvertida = new StringBuilder(x).reverse();
        return palavraInvertida.toString();
    }
    @org.jetbrains.annotations.NotNull
    public static boolean IsPalindromo(String x){
x.replaceAll("\\s+","").toLowerCase();
StringBuilder palvraInvertida = new StringBuilder(x).reverse() ;
        return  (x.equals(palvraInvertida.toString())) ;
    }
    @org.jetbrains.annotations.NotNull
    public static StringBuilder abreviarNome(String nome) {

        // Divide o nome completo em partes
        String[] partesDoNome = nome.split(" ");

        // Verifica se há mais de uma parte no nome
        StringBuilder nomeAbreviado = null;
        if (partesDoNome.length > 1) {
            String primeiroNome = partesDoNome[0];
            String ultimoNome = partesDoNome[partesDoNome.length - 1];
            nomeAbreviado = new StringBuilder(primeiroNome);

            // Abrevia os nomes do meio
            for (int i = 1; i < partesDoNome.length - 1; i++) {
                nomeAbreviado.append(" ").append(partesDoNome[i].charAt(0)).append(".");
            }

            // Adiciona o último nome
            nomeAbreviado.append(" ").append(ultimoNome);

            // Exibe o nome abreviado
        } else {
          nomeAbreviado = new StringBuilder(nome);
        }
        return nomeAbreviado;

    }

    public static void main(String[] args) {
        System.out.println("Digite o nome");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine() ;
        System.out.println(abreviarNome(x));
    }
}
