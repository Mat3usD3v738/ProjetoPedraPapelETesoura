
package D_CalcularSeEPrimo ;
import java.util.InputMismatchException;
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws InputMismatchException  {
        Scanner input = new Scanner(System.in);
        long numeroInput = 0 ; 
try{

    System.out.println("Digite um numero e diramos se é primo ou não");
    boolean IsPrimo = numeroInput == 2 || (numeroInput - 1 )% 2 ==  0 && numeroInput != 1 && numeroInput != 0 ; 
    
    numeroInput = input.nextLong() ;
    input.close();
    if (IsPrimo) {
        System.out.println("Este numero é primo");
    }else{
        System.out.println("Este numero não é primo");
    }
}catch(InputMismatchException e){
    e.printStackTrace();
    System.out.println("Valor errado");
}
   
   
    }

}
