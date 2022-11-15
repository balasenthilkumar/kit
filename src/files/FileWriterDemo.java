package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        File file = new File("D:\\class10\\daravuth\\notes1.txt");

        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write("Hi ");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
