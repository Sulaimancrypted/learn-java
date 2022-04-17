/*Program to display division after dividing a by b*/
/*Program accepts command line arguments*/
class DivideZero{
    public static void main(String arg[]){
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        int c;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has Occured.\nNow it will be handled by catch block and program will continue");
            b=1;
            c=a/b;
        }
        System.out.println("Division = "+c);
    }
}