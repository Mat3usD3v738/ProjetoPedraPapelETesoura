package W_Polimorfismo.Servico;
import W_Polimorfismo.domino.* ;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Servico {
    public static void main(String[] args)throws NullPointerException {

        Produto produto = null;
        Scanner input = new Scanner(System.in);
        try {
            String inputText = null;
            System.out.println("Digite que produto voce quer : ");
            inputText = input.next().toLowerCase();
            input.close();
            inputText = inputText.toLowerCase();

            produto = setProduto(inputText);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Produto nao encontrado");
        }

        if (produto == null) {
            System.out.println("Produto nao encontrado");
        } else{
            if (produto instanceof Tomate){
                produto.setNomeDoProduto("Tomate");
                produto.setValorDoProduto("R$1,00");
                ((Tomate) produto).setTipoDeTomate("Tomate Americano");
                produto.setCorDoProduto("vermelho");
            System.out.println("Produto encontrado");
            System.out.println("");
            produto.infor();
            }

        }
}


private static Produto setProduto(String inputText) throws  NullPointerException{
        if (inputText.equals("tomate")) {
            return (new Tomate());
        }

        if(inputText.equals("livro")){
          return (new Livro()) ;
        }

    if((!inputText.equals("livro")) && (!inputText.equals("tomate"))){
        return (null) ;
    }
    return null ;
}
}
