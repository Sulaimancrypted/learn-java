/*Static Variable in Function*/
class StaticTrial{
    static int sn;
    static void staticTest(){
        int n=0;
        n++;
        sn++;
        System.out.print("\nNormal Variable n="+n+"\nStatic Variable sn="+sn);
    }
    public static void main(String args[]){
        staticTest();
        staticTest();
        staticTest();
    }
}