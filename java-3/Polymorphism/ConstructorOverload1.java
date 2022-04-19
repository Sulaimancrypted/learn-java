/*Constructor overloading in a class*/
class ConstructorOverload {
    private int i, j;

    public ConstructorOverload() {
        i = 0;
        j = 0;
    }

    public ConstructorOverload(int a) {
        i = a;
        j = a;
    }

    public ConstructorOverload(int a,int b){
        i = a;
        j=b;
    }

    public void displayData() {
        System.out.println("i = " + i + "\tj = " + j);
    }
}

class ConstructorOverload1 {
    public static void main(String arg[]) {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload(5);
        ConstructorOverload obj3 = new ConstructorOverload(50, 70);
        System.out.println("For obj1 : ");
        obj1.displayData();
        System.out.println("For obj2 : ");
        obj2.displayData();
        System.out.println("For obj3 : ");
        obj3.displayData();
    }
}