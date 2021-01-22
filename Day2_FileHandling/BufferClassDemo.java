package Day2_FileHandling;
import java.io.*;

public class BufferClassDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DirectoryCreation\\abc.txt"));
        String line = br.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("DirectoryCreation\\abc.txt"));
        bw.write("Shows the importance of Buffered reader");
        bw.newLine();
        bw.write("New line");
        bw.close();
    }
    
}
