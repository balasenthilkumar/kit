package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\class10\\daravuth\\notes1.txt");
        FileReader fileReader = new FileReader(file);
        int out = fileReader.read();

        while(out !=-1){
            System.out.print((char)out);
            out = fileReader.read();
        }
    }
}
