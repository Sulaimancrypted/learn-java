//Using Serializable interface to write and read object to and from file
import java.io.*;
class Student extends Serializable {
    private String name,course;
    public Student() {
        name="";course="";
    }
    public Student(String n,String c) {
        name = n;
        course= c;
    }
    void display() {
        System.out.print("\n"+name+"\t\t "+course);
    }
    public String getName() {
        return(this.name);
    }
    public String getCourse() {
        return(this.course);
    }
    public void writeToFile() {
        /*writing object to file*/
        try {
            FileOutputStream fos =new FileOutputStream("student",true);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
        }
        catch(IOException e){
            System.out.println("Exception during Serialization : "+e);
            System.exit(0);
        }
    }
    public static void readFile() {
        Student f=new Student();
        /*Reading objects from file*/
        try {
            FileInputStream fis=new FileInputStream("student");
            while(true) {
                ObjectInputStream ios=new ObjectInputStream(fis);
                f=(Student)ios.readObject();
                if(f != null) {
                    if(f instanceof Student)
                        f.display();
                }
                else
                    break;
            }
            //ios.close();
        }
        catch(EOFException e) {
            //System.out.println("Exception during serialization : "+e);
            //System.exit(0);
        }
        catch(Exception e) {
            System.out.print(e);
        }
        //fis.close();
    }
}
public class Serializable {
    public static void main(String[] a) {
        Student f1=new Student("XYZ","BCA");
        Student f2=new Student("ABC","MCA");
        Student f3=new Student("PQR","BCA");
        System.out.print("Data to be written to file:\n");
        f1.display();
        f2.display();
        f3.display();
        /*Adding data to file*/
        f1.writeToFile();
        f2.writeToFile();
        f3.writeToFile();
        /*Reading data from file*/
        System.out.println("\nData from File : \nName\t\tCourse");
        Student.readFile();
    }
}


