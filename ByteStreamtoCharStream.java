import java.io.*;
public class ByteStreamtoCharStream {
    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in))
        {
            System.out.println("Enter some letters");
            int letters=isr.read();
            while(isr.ready())
            {
                System.out.println((char)letters);
                letters=isr.read();
            }
            isr.close();
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
