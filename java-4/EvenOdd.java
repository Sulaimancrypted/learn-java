
class Even extends Thread{
    int limit = 50;
    int enumber = 2;
    public void run(){
        while (enumber <= limit) {
            System.out.println(enumber);
            enumber = enumber + 2;
        }
    }
}


class Odd extends Thread{
    int limit = 50;
    int onumber = 1;
    public void run(){
        while (onumber <= limit) {
            System.out.println(onumber);
            onumber = onumber + 2;
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Even objEven = new Even();
        Odd objOdd = new Odd();
        objOdd.start();
        objEven.start();
    }
}
            