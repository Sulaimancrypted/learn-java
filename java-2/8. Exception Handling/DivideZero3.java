/*Program to display division after dividing a by b*/
/*Program accepts command line arguments*/
import java.util.*;
class DivideZero3{
    public static void main(String arg[]){
        int a,b,c;
        Scanner s=new Scanner(System.in);

        a=0;b=0;c=0;
        try{
            a=Integer.parseInt(arg[0]);
            b=Integer.parseInt(arg[1]);
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has Occured.\nNow it will be handled by catch block and program will continue");
            b=1;
            c=a/b;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception has Occured.\nNow it will be handled by catch block and program will continue");
            if(arg.length==0){
                System.out.print("Enter Value of a : ");
                a=s.nextInt();
                System.out.print("Enter Value of b : ");
                b=s.nextInt();
            }
            else{
                System.out.print("Enter Value of b : ");
                b=s.nextInt();
            }
            try{
                c=a/b;
            }
            catch(ArithmeticException ex){
                System.out.println("Arithmetic Exception has Occured in catch block for ArrayIndexOutOfBounds. \nNow it will be handled by catch block and program will continue");
                b=1;
                c=a/b;
            }
        }
        System.out.println("Division = "+c);
        s.close();
    }
}