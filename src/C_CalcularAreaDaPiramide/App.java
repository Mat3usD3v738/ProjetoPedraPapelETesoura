package C_CalcularAreaDaPiramide ;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException {

        
        Scanner input = new Scanner(System.in);
        long tamanhoDaBase , NumeroTotal = 0 , qVesesQSeRepete;
        try{

pularVariasLinhas(10);
        System.out.println("_________________________________________________________________________________________________");     
        System.out.println("Digite o numero do tamanho da base da pirãmide");
        pularVariasLinhas(10);
        tamanhoDaBase = input.nextLong();
        input.close();
        for (qVesesQSeRepete = 0 ; qVesesQSeRepete < tamanhoDaBase ; qVesesQSeRepete++) {
            NumeroTotal += tamanhoDaBase - qVesesQSeRepete  ;
        }
        pularVariasLinhas(2);
        System.out.println("\nO número é : "+'\n');
        System.out.println(NumeroTotal+"\n");
        System.out.println('\n'); 
        pularVariasLinhas(10);
                       System.out.println("_________________________________________________________________________________________________");
    System.out.println('\n');
    
    
                    }catch(InputMismatchException e){
        System.out.println("_________________________________________________________________________________________________");
        System.out.println("\nTente novamente");
        System.out.println("Você deve escrever números , não letras ou sinais ");
        System.out.println("Exeçao : " +e);
pularVariasLinhas(10);
System.out.println("\n");
System.out.println('\n');
    }
}

private static void pularVariasLinhas(int quantasLinhas){
    
  for (int i = 0; i < quantasLinhas + 1; i++) {
    System.out.println('\n');
  }
}
}
