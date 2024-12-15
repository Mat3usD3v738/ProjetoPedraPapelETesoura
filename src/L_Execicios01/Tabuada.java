package L_Execicios01 ; 
import java.util.Scanner;
/*Este codigo calcula a tabuada3 */
public class Tabuada{
    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
int valor ;
System.out.println("voce quer a tabuada de qual numero ?");
valor = input.nextInt();
System.out.println("\n");
System.out.println("________________________________________________");
System.out.println("\n");
input.close();
System.out.println("A tabuada do numero " +valor+ " é");
for (int i = 1; i < 10 + 1; i++) {

System.out.println(valor+ " x "+i+" = "+valor*i);


}
























    }
}