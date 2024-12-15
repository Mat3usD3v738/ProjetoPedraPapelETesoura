package R_Polimorfismo.dominnio.ClassesFilhas ; 
import R_Polimorfismo.dominnio.ClasseMãe.*;

public class Carro extends Produto{

    @Override
    public void comprar() {
       
        System.out.println("comprou o carro");
    }
    


    
}
