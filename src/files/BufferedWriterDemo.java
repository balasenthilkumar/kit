package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\class10\\daravuth\\notes1.txt");
        FileWriter writer = new FileWriter(file);
        BufferedWriter bwriter = new BufferedWriter(writer);

        bwriter.write("this is an example for BufferedWriter");
        bwriter.newLine();
        bwriter.write("this is an example of new line in Buffered Writer");
        bwriter.flush();
        bwriter.close();
    }


}
