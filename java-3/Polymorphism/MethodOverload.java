class MethodClass {
    private int i, j;

    public void getData() {
        i = 0;
        j = 0;
    }

    public void getData(int a) {
        i = a;
        j = 0;
    }

    public void getData(int a, int b) {
        i = a;
        j = b;
    }

    public void displayData() {
        System.out.println("i = " + i + "\tj = " + j);
    }
}

public class MethodOverload {
    public static void main(String arg[]) {
        MethodClass obj1 = new MethodClass();
        MethodClass obj2 = new MethodClass();
        MethodClass obj3 = new MethodClass();
        obj1.getData();
        obj2.getData(5);
        obj3.getData(50, 70);
        System.out.println("For obj1 : ");
        obj1.displayData();
        System.out.println("For obj2 : ");
        obj2.displayData();
        System.out.println("For obj3 : ");
        obj3.displayData();
    }
}
