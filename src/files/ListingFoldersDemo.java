package files;

import java.io.File;

public class ListingFoldersDemo {

    public static void main(String[] args) {
        File directory = new File("D:\\");
        //String[] list = directory.list();
       File[] files = directory.listFiles(); // retrieve the name with complete path

        for(File s:files){
            if(s.isFile()){  // retrieving only files
              String fName = s.getName();    // gettign fileName
              int pointer = fName.lastIndexOf(".");   // find out the index of "."
              String extension = fName.substring(pointer+1); // using the pointer in subString as beginIndex
                if(fName.length()>1000){
                    System.out.println(fName);
                }
            }

        }


    }
}
