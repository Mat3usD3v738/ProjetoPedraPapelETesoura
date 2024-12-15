package F_ClassesUtilitarias.Awrapes ;
import java.util.Scanner;
public class Wrappers {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
   Character charW  ;
   charW = input.next().charAt(0);
   System.out.println(charW.isLetter(charW));
   input.close(); 
}
}