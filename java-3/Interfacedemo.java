
/*Inheriting Single interface*/
//import java.io.*;
import java.util.*;

interface Shape {
    static final float pi = 3.14F;

    void getData();

    void setData(int s);

    void setData(int a, int b);

    void area();

    void perimeter();

    void display();
}

class Square implements Shape {
    private int p, s, a;

    public void setData(int i) {
        s = i;
    }

    public void area() {
        a = s * s;
    }

    public void perimeter() {
        p = 4 * s;
    }

    public void display() {
        System.out.println("\nSide of Square : " + s + "\nArea of Square : " + a + "\nPerimeter of Square : " + p);
    }

    public void getData() {
    }

    public void setData(int a, int b) {
    }
}

class Triangle implements Shape {
    private int base, height;
    private float a;

    public void getData() {
        Scanner b = new Scanner(System.in);
        System.out.print("\nEnter Base of Triangle : ");
        base = b.nextInt();
        System.out.print("Enter Height of Triangle : ");
        height = b.nextInt();
        b.close();
    }

    public void area() {
        a = 0.5F * (float) base * (float) height;
    }

    public void display() {
        System.out.println("Base and Height of Triangle: " + base + " " + height + "\nArea of Triangle : " + a);
    }

    public void setData(int a, int b) {
        base = a;
        height = b;
    }

    public void setData(int i) {
    }

    public void perimeter() {
    }
}

class Circle implements Shape {
    private int r;
    private float a, p;

    public void setData(int i) {
        r = i;
    }

    public void area() {
        a = pi * r * r;
    }

    public void display() {
        System.out.println("\nRadius of Circle: " + r + "\nArea of Circle : " + a + "\nPerimeter of Circle : " + p);
    }

    public void perimeter() {
        p = 2 * pi * r;
    }

    public void setData(int a, int b) {
    }

    public void getData() {
    }
}

class Interfacedemon {
    public static void main(String arg[]) {
        Square s = new Square();
        s.setData(5);
        s.area();
        s.perimeter();
        s.display();
        Triangle t = new Triangle();
        t.getData();
        t.area();
        t.display();
        Circle c = new Circle();
        c.setData(6);
        c.area();
        c.perimeter();
        c.display();
    }
}