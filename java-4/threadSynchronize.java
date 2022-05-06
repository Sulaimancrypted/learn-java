
/*Synchronization of threads*/
import java.io.*;
import java.util.*;

//class of which objects will be executed in parallel by multiple threads
class Array1D {
    private int a[], n;

    public Array1D(int x) {
        n = x;
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = 0;
    }

    public void getData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array " + n + " Elements for object :");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
    }

    public void scalar(int s) {
        for (int i = 0; i < n; i++)
            a[i] = a[i] * s;
    }

    public void largest() {
        int l = a[0];
        for (int i = 0; i < n; i++)
            if (l < a[i])
                l = a[i];
        System.out.println("Largest element in array : " + l);
    }

    public synchronized void display() {
        System.out.println("Array Elements : ");
        for (int i = 0; i < n; i++)
            System.out.print(" " + a[i]);
        System.out.print("\n");
    }
}

// Class which implement threads for class Array1D
class ThreadedArray extends Thread {
    Array1D array;
    private Thread t;

    ThreadedArray(Array1D obj) {
        array = obj;
    }

    public void run() {
        synchronized (array) {
            array.getData();
        }
        array.largest();
        array.scalar(5);
        array.display();
    }
}

public class threadSynchronize {
    public static void main(String args[]) {
        Array1D obj1 = new Array1D(5);
        Array1D obj2 = new Array1D(5);
        ThreadedArray t1 = new ThreadedArray(obj1);
        ThreadedArray t2 = new ThreadedArray(obj1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
