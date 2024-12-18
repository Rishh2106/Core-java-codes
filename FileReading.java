import java.io.FileReader;
import java.io.IOException;
public class FileReading {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("demo.txt"))
        {
            int letters=fr.read();
            while(fr.ready())
            {
                System.out.println((char)letters);
                letters=fr.read();
            }
            fr.close();
            System.out.println();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
