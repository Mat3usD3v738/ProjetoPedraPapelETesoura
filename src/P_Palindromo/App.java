package P_Palindromo ;
import java.util.Scanner ;

public class App {
       public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    String palavrainput = "null";
    System.out.println("Escreva um palavra para verificar se é um palíndromo");
    palavrainput = input.nextLine();
    input.close();
    if (palavrainput.isEmpty()) {
        System.out.println("Digite algo");

        main(args);
    }
    String palavraInvertida = new StringBuilder(palavrainput).reverse().toString(); 
    
if (palavraInvertida.equals(palavrainput) && palavrainput.equals(palavraInvertida)) {
    System.out.println("É um Palíndromo");
}else{
    System.out.println("Não é um Palíndromo");
}

    
    }
}
