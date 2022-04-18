//package Polymorphism;

/*Function overloading for different datatypes*/
class FunOverload{
    public static int sum(int a,int b){
        System.out.println("Function for Integers - ");
        int c=a+b;
        return(c);
    }
    public static float sum(float a,float b){
        System.out.println("Function for Floats - ");
        float c=a+b;
        return(c);
    }
    public static double sum(double a,double b){
        System.out.println("Function for Doubles - ");
    double c=a+b;
    return(c);
}
    public static void main(String arg[]){
        int s1=sum(5,3);
        System.out.println("Sum of Integers : "+s1);
        float s2=sum(5.6F,8.9F);
        System.out.println("Sum of Floats : "+s2);
        double s3=sum(5.67,8.93);
        System.out.println("Sum of Doubles : "+s3);
    }
}