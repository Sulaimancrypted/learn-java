class PublicDemo{
    private int n;
    public void setData(int a){
        n=a;
    }
    public void display(){
        System.out.print("n="+n);
    }
}
class PublicDemoImp{
    public static void main(String arg[ ]){
        PublicDemo objPublicDemo = new PublicDemo();
        objPublicDemo.setData(5);
        objPublicDemo.display();
    }
}