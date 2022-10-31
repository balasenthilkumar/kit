package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        File file = new File("D:\\class10\\daravuth\\notes.txt");
        File newFile = new File("D:\\class10\\daravuth\\notesForDaravuth.txt");
        if(newFile.exists()){

               // file.renameTo(newFile);

            System.out.println(newFile.getName());
        }else {
            System.out.println("file not found in this location");
        }


    }
}
