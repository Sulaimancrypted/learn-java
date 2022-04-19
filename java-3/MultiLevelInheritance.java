//package java-3;


/* Program demonstrates Multilevel Inheritance */
/*
 * Here ‘A’ is a super class for class ‘B’, while ‘B’ is super class
 * for class ‘C’
 */
class A1 {
    protected int a, b;

    public void setDataA(int i, int j) {
        a = i;
        b = j;
    }

    public void displayA(){
        System.out.println("\nObject\nFrom class A: a="+a+"\nb= "+b);
    }
}

class B1 extends A1 {
    protected int c;

    public void setDataB(int i,int j, int k){
        super.setDataA(i,j);
        c=k;
    }

    public void displayB(){
        System.out.println("\nObject for class B:\nFrom class A: a= "+a+"\nb= "+b+"\nFrom class B: c= "+c);
    }
}
class C1 extends B1{
    protected String n;
    public void setDataC(int i,int j, int k,String l){
        super.setDataB(i,j,k);
        n=l;
    }
    public void displayC()
    {
        System.out.println("\nObject for class C:\nFrom class A: a= "+a+"\nb= "+b+"\nFrom class B: c = "+c+"\nFrom class C: n= "+n);
    }
}
class MultiLevelInheritance{
    public static void main(String arg[]){
    A1 obA=new A1();
    B1 obB=new B1();
    C1 obC=new C1();
    obA.setDataA(4,5);
    obA.displayA();
    obB.setDataB(40,50,60);
    obB.displayB();
    obC.setDataC(400,500,600,"ABC");
    obC.displayC();
}
}