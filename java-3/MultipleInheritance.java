

//JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE

class A2
{
    protected int a,b;
    public void setDataA(int i, int j){
        a=i;b=j;
    }
    public void displayA(){
        System.out.println("\nObject for class A: \nFrom class A: a="+a+"\nb= "+b);
    }
}
class B2{
    protected int c;
    public void setDataB(int k){
        c=k;
    }
    public void displayB(){
        System.out.println("\nObject for class B:\nFrom class B: c= "+c);
    }
}

// class C extends A,B {
//     private String n;
//     public void setDataC(int i,int j, int k, String l){
//         super.setDataA(i,j);
//         super.setDataB(k);
//         n=l;
//     }

//     public void displayC(){
//         System.out.println("\nObject for class C:\nFrom class A: a= "+a+"\nb= "+b+"From class B: c= "+c+"\nFrom class C: n= "+n);
//     }
// }

class MultipleInheritance{
    public static void main(String arg[]){
        A2 obA=new A2();
        B2 obB=new B2();
        //C obC=new C();
        obA.setDataA(4,5);
        obA.displayA();
        obB.setDataB(40);
        obB.displayB();
        //obC.setDataC(400,500,600,"ABC");
        //obC.displayC();
    }
}