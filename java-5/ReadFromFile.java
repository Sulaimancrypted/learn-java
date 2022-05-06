
//Reaing Data from file
import java.io.*;
class ReadFromFile
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("trial.txt");
        int c;
        FileInputStream fis=new FileInputStream(f);
        while((c=fis.read())!=-1)
            System.out.print((char)c);
        fis.close();
    }
}