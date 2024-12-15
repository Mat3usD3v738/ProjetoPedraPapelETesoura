package W_Polimorfismo.domino;

public interface ProdutoInterface {
   default void comprar(){

       System.out.println("Comprei um : ");
   }
    default  void vender(){
        System.out.println("Vendi um : ");

    }
}
