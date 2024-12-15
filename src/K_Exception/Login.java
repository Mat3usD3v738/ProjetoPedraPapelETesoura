package K_Exception ;

import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws InvalidParameterException {
     String nomeDoAquivo = "";
File file = new File(nomeDoAquivo);

try {
    
    file.createNewFile();
    System.out.println("Criado com sucesso");
   
} catch (IOException e) {
    
    e.printStackTrace();
}
   

    }
    private static void logar() throws InvalidParameterException{
      Scanner inputConsole = new Scanner(System.in);
      String nomeBD , nomeIN ,senhaIN ,  senhaBD ;
      nomeBD = "Goku" ; 
      senhaBD = "ssj" ; 
      System.out.println("Nome de usuario");
      nomeIN = inputConsole.nextLine();
      System.out.println("Senha do usuario");
      senhaIN = inputConsole.nextLine();
if (!nomeIN.equals(nomeBD) || !senhaBD.equals(senhaIN)) {
    System.out.println("Acesso negado");
}else if (nomeIN.equals(nomeBD) && senhaBD.equals(senhaIN)) {
    System.out.println("Acesso liberado");
}

    }
}
