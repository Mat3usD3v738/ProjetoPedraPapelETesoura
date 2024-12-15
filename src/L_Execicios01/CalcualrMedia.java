package L_Execicios01 ;
import java.util.Scanner;
public class CalcualrMedia {
public static void main(String[] args) {
    System.out.println("__________________________________________________________________________");
System.out.println("\n");
    Scanner input = new Scanner(System.in);
    String nome ;
    float primeiraNota , segundaNota ,terceiraNota;
    System.out.println("Diga o nome  completo do aluno ");
    System.out.println("\n");
    nome = input.nextLine();
    System.out.println("Diga a primeira nota");
    System.out.println("\n");
    primeiraNota = input.nextFloat();
    System.out.println("Diga a segunda nota");
    System.out.println("\n");
    segundaNota= input.nextFloat();
    System.out.println("Diga a terciera nota");
    System.out.println("\n");
    terceiraNota = input.nextFloat();
    input.close();
    System.out.println("__________________________________________________________________________");
    if (CalcularMedia(primeiraNota, segundaNota, terceiraNota)) {
        System.out.println(nome+ " esta aprovado");
        System.out.println("sua media :" +CalcularMediaFloa(primeiraNota, segundaNota, terceiraNota));
        System.out.println("\n");
    }else{
        System.out.println(nome+ " esta desaprovado");
        System.out.println("sua media :" +CalcularMediaFloa(primeiraNota, segundaNota, terceiraNota));
        System.out.println("\n");
    }
}

private static boolean CalcularMedia(float primeira , float segunda, float terceira){


return (primeira + segunda +terceira ) / 3 >= 7 ;
}
private static float CalcularMediaFloa(float primeiraN , float segundaN ,  float terceiraN){


    return (primeiraN + segundaN +terceiraN) / 3 ;
    }
}
