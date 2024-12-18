import java.io.*;
public class FileWriting {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("output.txt",true))
        {
            //The true in the filewriter args tell that we want to append the value in the file, if we don't write true there it'll always write fresh on the file
            fw.write("This is the content written on the file");
            fw.write("This is appended on the file");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
