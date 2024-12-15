package Y_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest01 extends Object {
    public static void main(String[] args) {
        File file = new File("" + "oi.java");

        try (FileWriter fileWriter = new FileWriter(file)) {
            file.createNewFile();


        } catch  (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
