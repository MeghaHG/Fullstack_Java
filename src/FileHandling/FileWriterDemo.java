package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
         FileWriter filewriter=null;
        try{
            filewriter =new FileWriter("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text2.txt");
            filewriter.write("Hello World");
            System.out.println("file write successfully");
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try{
                filewriter.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }

        FileReader fileReader=null;

        try{
            fileReader = new FileReader("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text2.txt");
            int i = fileReader.read();
            while (i>0){
                System.out.print((char) i);
                i = fileReader.read();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try{
                fileReader.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
