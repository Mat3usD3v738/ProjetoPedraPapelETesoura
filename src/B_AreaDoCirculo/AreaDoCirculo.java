package B_AreaDoCirculo ; 
import java.util.Scanner;
public class AreaDoCirculo {

    public static void main(String[] args) {

        System.out.println(
                "_____________________________________________________________________________________________________________________________________________________________________");
        Scanner raio_Scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite o valor do Raio em centimetros será mostrado a area do Circulo ");
        double raio = raio_Scanner.nextDouble();
        double pi = Math.PI;
        double raioAoQuadrado = raio * raio;
        double area = pi * raioAoQuadrado;
        double area_emM = area / 100;
        if (area > 100) {
            System.out.println(area_emM + "  metros quadrados é a area do circulo");
        } else {
            System.out.println(area + " centimetros quadrado é a area do circulo");
        }

        raio_Scanner.close();
        System.out.println();// espasso
        System.out.println(
                "_____________________________________________________________________________________________________________________________________________________________________");

    }
}
