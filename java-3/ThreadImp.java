//import java.lang.*;

/*defining and executing thread*/
class ThreadTrial extends Thread {
    public void run() {
        System.out.print("Thread Execution Started .....");
    }
}

/* Thread Implementation class */
class ThreadImp {
    public static void main(String[] args) {
        ThreadTrial objTh = new ThreadTrial();
        objTh.start();
    }
}