
class Even extends Thread{
    int limit = 50;
    int evenNumber = 2;
    public void run(){
        while (evenNumber <= limit) {
            System.out.println(evenNumber);
            evenNumber = evenNumber + 2;
        }
    }
}


class Odd extends Thread{
    int limit = 50;
    int oddNumber = 1;
    public void run(){
        while (oddNumber <= limit) {
            System.out.println(oddNumber);
            oddNumber = oddNumber + 2;
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
            