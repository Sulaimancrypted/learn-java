//package Polymorphism;
/*Function overloading for different number of Arguments*/
class FunOverload2 {
    public static int area(int l, int b) {
        System.out.println("Function for area of Rectangle - ");
        int c = l * b;
        return (c);
    }

    public static int area(int s) {
        System.out.println("Function for area of Square - ");
        int c = s * s;
        return (c);
    }

    public static float area(float r) {
        System.out.println("Function for area of Circle - ");
        float c = 3.14f * r * r;
        return (c);
    }

    public static void main(String arg[]) {
        int ar = area(5, 3);
        System.out.println("Area of Rectangle : " + ar);
        int as = area(5);
        System.out.println("Area of Square : " + as);
        float ac = area(5.6f);
        System.out.println("Area of Circle : " + ac);
    }
}
