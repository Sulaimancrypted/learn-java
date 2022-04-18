
/*Program demonstrates Hierarchical Inheritance*/
/*Here ‘A’ is a super class for class ‘B’ and class ‘C’*/
class A{
    protected int a,b;
    public void setDataA(int i, int j){
        a=i;b=j;
}
    public void displayA(){
        System.out.println("\nObject for class A: \nFrom class A: a="+a+"\nb= "+b);
    }
}
class B extends A{
    private int c;
    public void setDataB(int i,int j, int k){
        super.setDataA(i,j);
        c=k;
    }
    public void displayB(){
        System.out.println("\nObject for class B:\nFrom class A: a= "+a+"\nb= "+b+"\nFrom class B: c= "+c);
    }
}

class C extends A{
    private String n;
    public void setDataC(int i,int j, String k){
        super.setDataA(i,j);
        n=k;
    }
    public void displayC(){
        System.out.println("\nObject for class C:\nFrom class A: a= "+a+"\nb= "+b+"\nFrom class C: n= "+n);
    }
}

class HierarchicalInheritance{
    public static void main(String arg[]){
        A obA=new A();
        B obB=new B();  
        C obC=new C();
        obA.setDataA(4,5);
        obA.displayA();
        obB.setDataB(40,50,60);
        obB.displayB();
        obC.setDataC(400,500,"ABC");
        obC.displayC();
    }
}