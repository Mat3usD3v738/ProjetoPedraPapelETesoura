package Q_PedraPapelTesoura01 ;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException  {
      
        boolean isInputValido ; 
        String papel , tesoura , pedra ;
        papel = "papel"; 
        tesoura = "tesoura" ;
        pedra = "pedra" ;
        Scanner input = new Scanner(System.in);
        String inputUsuario ;
        boolean IsComputadorGanhado = false ;
        boolean IsUsuariaGanhado = false ;
        String jogadaDoComputador ; 
        boolean IsImpate = false ;  
String []jogadasDoComputadoArray= new String[]{tesoura,papel,pedra};
   System.out.println("Digite : pedra papel ou tesoura");
inputUsuario = input.nextLine();
//Fechar console 
input.close();
if(inputUsuario.isBlank()) {
  System.out.println("Não use espaços");
}else{
  inputUsuario.toLowerCase();
}
isInputValido = (inputUsuario.equals(pedra) || 
inputUsuario.equals(papel) || 
inputUsuario.equals(tesoura));

if (isInputValido) {
  /*Sortear jogada do computador por meio de um array */
  
  jogadaDoComputador = jogadasDoComputadoArray[sortear(new Random())];
  IsComputadorGanhado = (((inputUsuario.equals(tesoura)) &&
  (jogadaDoComputador.equals(pedra))) || ((inputUsuario.equals(pedra) && 
   jogadaDoComputador.equals(papel))) || (jogadaDoComputador.equals(tesoura) &&
    inputUsuario.equals(papel))) && (!IsUsuariaGanhado) && !IsImpate;
 
 IsUsuariaGanhado = (((jogadaDoComputador.equals(tesoura)) &&
 (inputUsuario.equals(pedra))) || ((jogadaDoComputador.equals(pedra) && 
  inputUsuario.equals(papel))) || (inputUsuario.equals(tesoura)
   && jogadaDoComputador.equals(papel))) && (!IsComputadorGanhado) && !IsImpate; ;
 IsImpate = inputUsuario.equals(jogadaDoComputador) ;


  if (IsImpate) {
    System.out.println("O jogo impatou , pois o usuario e o computador jogaram a mesma coisa");
  }else if (IsComputadorGanhado) {
imprimirQueOComputadorGanhou(jogadaDoComputador, inputUsuario);
  }else if (IsUsuariaGanhado) {
   imprimirQueOUsuarioGanhou(jogadaDoComputador, inputUsuario);
  }
}else{
  System.out.println("Digite algo valido");

}

    }
    /**
     * 
      @param sortear deve receber um objeto Random : 
      @return vai retornar um número aleatorio de 0 á 2 
     */
    private static byte sortear(Random ger)throws IllegalArgumentException{
      return (byte) ger.nextInt(3);
    }
   /**
    * 
    * @param jogadaDoComputador o que o computador sorteou
    * @param inputUsuario Oque o usuario escreveu 
    */
    private static void imprimirQueOComputadorGanhou(String jogadaDoComputador , String inputUsuario){
      System.out.println("");
    System.out.println("O Computador venceu");
    System.out.println("Jogada do computador : "+jogadaDoComputador);
    System.out.println("Jogada do usuario : "+inputUsuario);
    }

     /**
    * 
    * @param jogadaDoComputador o que o computador sorteou
    * @param inputUsuario Oque o usuario escreveu 
    */
    private static void imprimirQueOUsuarioGanhou(String jogadaDoComputador , String inputUsuario){
      System.out.println("");
    System.out.println("O Usuario venceu");
    System.out.println("Jogada do usuario : "+inputUsuario);
    System.out.println("Jogada do computador : "+jogadaDoComputador);
    }

}
