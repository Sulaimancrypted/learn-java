/*Program to display division after dividing a by b*/
/*Program accepts command line arguments*/
class Runtime{
    public static void main(String arg[]){
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        float c=a/b;
        System.out.print("Division = "+c);
    }
}