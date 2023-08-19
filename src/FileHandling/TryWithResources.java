//package FileHandling;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class TryWithResources {
//
//    public static void main(String[] args) {
//        try (Filefilewriter =new FileWriter("C:/Users/Admin/IdeaProjects/java8/src/FileHandling/text2.txt")){
//            filewriter.write("Hello World");
//            System.out.println("file write successfully");
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
//    }
//}