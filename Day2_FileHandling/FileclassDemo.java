package Day2_FileHandling;
import java.io.*;
import java.util.Scanner;

public class FileclassDemo {
    public static void main(String[] args) throws IOException{

        File f = new File("abc.txt");  //Check if abc.txt is exists
        f.createNewFile();   //If abc.txt doesn't exits create a file
        FileWriter fw = new FileWriter("abc.txt");   //write object to filewriter
        System.out.println("Write the contents to save in file:");
        char ch = ' ';
        Scanner scan = new Scanner(System.in);
        while(ch != '.')
        {
            String s = scan.nextLine();
            for(int i=0; i<s.length(); i++)
            {
            fw.write(s.charAt(i));
            ch = s.charAt(i);
            }
            fw.write("\n");
        }
        fw.close();

        // Append Data in file Make directory and file inside directory
        File f1 = new File("DirectoryCreation");  //check directory is present
        f1.mkdir();  //If dir not present creates new dir
        File f2 = new File("DirectoryCreation\\abc.txt"); //check file is present
        f2.createNewFile();
        FileWriter fw1 = new FileWriter(f2, true);  //using object to reterive file, giving 'true' append in file
        System.out.println("Write the contents to save in file and it appends:");
        char ch1 = ' ';
        while(ch1 != '.')
        {
            String s = scan.nextLine();
            for(int i=0; i<s.length(); i++)
            {
            fw1.write(s.charAt(i));
            ch1 = s.charAt(i);
            }
            fw1.write("\n");
        }
        fw1.close();


        //Reteriving data from file and printing it in the console

       
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read(); //reading first character from file in integer format
        while(i != -1)
        {
            System.out.print((char)i); //Prints single charcter each time
            i = fr.read();
        }
        fr.close();
    }
    
}
