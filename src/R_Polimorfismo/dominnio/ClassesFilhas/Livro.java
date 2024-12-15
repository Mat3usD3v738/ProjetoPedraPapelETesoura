package R_Polimorfismo.dominnio.ClassesFilhas ;
import R_Polimorfismo.dominnio.ClasseMãe.*;

public class Livro extends Produto{

    @Override
    public void comprar() {
        System.out.println("Comprei o livro");
    }
    
}
