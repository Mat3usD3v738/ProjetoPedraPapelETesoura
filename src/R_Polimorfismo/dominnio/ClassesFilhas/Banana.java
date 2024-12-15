package R_Polimorfismo.dominnio.ClassesFilhas ;
import R_Polimorfismo.dominnio.ClasseMãe.*;
public class Banana extends Produto {

    @Override
    public void comprar() {
    
        System.out.println("Comprou uma banana");
    }
  
    
     
}
