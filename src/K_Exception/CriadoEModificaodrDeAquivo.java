package K_Exception ; 
import java.io.FileWriter;
import java.io.IOException; 
import java.io.BufferedWriter ; 
public class CriadoEModificaodrDeAquivo {
 public static void main(String[] args) {

        String caminho = "style.css";
        String texto = "body {\n" +
             "    width: 100%;\n" +
             "    height: 100vh;\n" +
             "    margin: 0;\n" +
             "    padding: 0;\n" +
             "}\n" +
             "\n" +
             "div {\n" +
             "    background-color: red;\n" +
             "    border: solid 3.5px black;\n" +
             "    width: 100px;\n" +
             "    height: 100px;\n" +
             "}";

        try (FileWriter fw = new FileWriter(caminho, false); // 'false' significa sobrescrever
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(texto);
            System.out.println("Texto escrito no arquivo com sucesso!"); 
            System.out.println('\n');
            System.out.println("http://127.0.0.1:3000/main.html");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }


}
