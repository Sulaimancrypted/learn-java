
//Writing Data to file
import java.io.*;
class WriteToFile
{
    public static void main(String[] args) throws IOException
    {
        String s=new String("Welcome to java file handling.");
        byte b[]=s.getBytes();
        File f=new File("TrialFile.txt");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(b);
        System.out.print("File Created.");
        fos.close();
    }
}