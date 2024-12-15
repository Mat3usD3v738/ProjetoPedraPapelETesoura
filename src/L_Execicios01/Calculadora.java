package L_Execicios01 ; 
import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float num1 ,num2 ; 
    System.out.println("Digite um numero");
    num1 = input.nextFloat();
System.out.println("Digite outro numero");
num2 = input.nextFloat();
System.out.println("Agora oque você quer fazer com esses numeros responda com os sinais como + - x :");
switch (input.next().charAt(0)) {
    
    case '+':{

        
        System.out.println("O resultado da soma é " +num1+num2);
    }
        break;
case '-' :
System.out.println("O resultado da subtração  é " +(num1 - num2));

break;

case 'x' :

System.out.println("O resultado da multiplicação é " +(num1 * num2));

break ;

case ':' :

System.out.println("O resultado da divisao é " +(num1 / num2));

break ;
    default:
    System.out.println("Invalido");
        break;
}
input.close();
    }
}