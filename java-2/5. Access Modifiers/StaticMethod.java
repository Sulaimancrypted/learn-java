/*Static Method in a class*/

class StaticMethod{
    static private int sn;
    private int n;
    public StaticMethod(int a){
        sn++;
        n=a;
        System.out.println("\nIt is Object number : "+sn);
    }
    
    public static void staticShow(){
        System.out.println("\nNumber of objects created"+sn+"\n");
    }
    
    public void display(){
        System.out.println("Value of n in object is "+n);
    }
}

class StaticImp{
    public static void main(String args[]){
        StaticMethod.staticShow();
        StaticMethod sm1=new StaticMethod(34);
        sm1.display();
        StaticMethod.staticShow();
        StaticMethod sm2=new StaticMethod(1);
        sm2.display();
        StaticMethod.staticShow();
        StaticMethod sm3=new StaticMethod(45);
        sm3.display();
        StaticMethod.staticShow();
    }
}