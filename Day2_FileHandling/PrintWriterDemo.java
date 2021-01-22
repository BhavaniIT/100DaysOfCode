package Day2_FileHandling;
import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println(100); //Integer directly adding to file which is not possible in java
        Integer i = 10;
        pw.println(i); //Integer object
        pw.println(10.5);
        pw.println("File name");
        pw.write(100); // write methods add char 'd' in file
        pw.close();
    }
}
