package O_LacosDeRepeticao ;
import java.util.Scanner;

public class ExercicioBreak {
    public static void main(String[] args) {
        Scanner valorTotal_scanner = new Scanner(System.in);
        float valorTotal = 0;
        System.out.println("Digite o valor do carro ");
        valorTotal = valorTotal_scanner.nextFloat();
        valorTotal_scanner.close();
        System.out.println("Aqui esta o valor das parcelas 10");
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            float valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }

    }
}
