package H_ContagemDeCaracteres ;

import java.util.InputMismatchException;
import java.util.Scanner ; 

public class App  {
    public static void main(String[] args)throws InputMismatchException , IndexOutOfBoundsException{
        // instancia Scanner para ler dados no terminal ou console
        Scanner input = new Scanner(System.in);
        //Variaveis 
        String inputString ; 
        char [] caracteres ;
        //Inicio do codigo 
        System.out.println("Digite o a palavra ou frase para podemos contar os caracteres");
        try {
            inputString = input.nextLine();
            
            caracteres = inputString.toCharArray();
            System.out.println("Numero de caracteres :");
            System.out.println(+caracteres.length);
       
        } catch (InputMismatchException e) {
           System.out.println("Erro coloque coisas validas como : frases , palavras ,textos , etc ....");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
           System.out.println("Erro nos Arrays");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Erro");
            e.printStackTrace();
        }
        //Fechar o terminal 
        input.close();
    }
}
