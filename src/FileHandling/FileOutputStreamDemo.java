package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream obj = new FileOutputStream("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text.txt");
            String str = "Welcome";
            byte[] arr= str.getBytes();
            obj.write(arr);

            System.out.println("File write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text.txt");
            int ch = fileInputStream.read();
            while(ch>0){
                System.out.print((char) ch);
                ch = fileInputStream.read();

            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
