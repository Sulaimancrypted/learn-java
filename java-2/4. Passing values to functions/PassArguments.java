/*Passing values to functions*/

class PassArguments{
    static int sqWithArg(int c){
        return(c*c);
    }
    static int sqNoArg(){
        return(2*2);
    }
    public static void main(String args[]){
        int a;
        a= Integer.parseInt(args[0]);
        int s1=sqWithArg(a);
        System.out.print("\nSquare of "+a+" is "+s1);
        int s2= sqNoArg();
        System.out.print("\nSquare of 2 is "+s2);
    }
}