package FileHandling;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream obj = new FileOutputStream("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text3.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(obj);
            String str = "Welcome";
            byte[] arr = str.getBytes();

            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");
            bufferedOutputStream.close();
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text3.txt");

            int ch = fileInputStream.read();
            while (ch > 0) {
                System.out.print((char) ch);
                ch = fileInputStream.read();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}