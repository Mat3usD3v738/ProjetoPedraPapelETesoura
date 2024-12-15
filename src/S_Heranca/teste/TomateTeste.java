package S_Heranca.teste ;
import S_Heranca.dominio.*;

public class TomateTeste {

    public static void main(String[] args) throws java.lang.Error{
        Tomate tomate = new Tomate();
        
         tomate.setNome("Mexicano");
   tomate.setData(5,5,5);         
         System.out.println("A validade do " +tomate.getClass()+ "\n"+tomate.getNome()+ " é " +tomate.getData(30,7,1945));
        

        }
}
