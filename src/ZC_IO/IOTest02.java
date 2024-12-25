package ZC_IO;

import java.io.IOException;
import java.lang.reflect.TypeVariable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Locale;

public class IOTest02 {
    public static void main(String[] args) throws IOException {
        /*
        1. Criar e Manipular Caminhos
Tarefa: Crie um programa que:

Crie um objeto Path para um arquivo chamado meuarquivo.txt no diretório /home/usuario/documentos.
Imprima o caminho absoluto e o nome do arquivo.
Imprima o número de elementos no caminho.
Dicas:

Use Path.of ou Paths.get para criar o caminho.
Métodos úteis: .toAbsolutePath(), .getFileName(), .getNameCount().
         */

        Path p2 = Paths.get("/..");
        Path p1 = Paths.get("/home/mateus/");
        System.out.println("________________________________-");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
        System.out.println(p1.resolve(p1));
        System.out.println(p2.resolve(p2));


    }
}
