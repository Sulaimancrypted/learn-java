
class RunnableTrial implements Runnable{
    int thId;
    
    public RunnableTrial(int i){
        thId = i;
    }    

    public void run(){
        System.out.println("Thread "+ thId + " Execution started using Runnable Interface...");
    }
}

/* Thread implementation class */

class RunnableInterface{
    public static void main(String[] args) {
        RunnableTrial objRun = new RunnableTrial(1);
        Thread objTh = new Thread(objRun);
        objTh.start();
    }
}
