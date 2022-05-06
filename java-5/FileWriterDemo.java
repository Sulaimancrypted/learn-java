
    // Demonstrate FileWriter.
import java.io.*;
    class FileWriterDemo
    {
        public static void main(String[] args) throws Exception
        {
            String source = "Welcome to the world of java file";
            char[] buffer = new char[source.length()];
            source.getChars(0, source.length(), buffer, 0);
            FileWriter f = new FileWriter("trial.txt");
            for (int i=0; i < buffer.length; i ++)
            {
                f.write(buffer[i]);
            }
            f.close();
        }
    }

