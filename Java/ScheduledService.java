import java.util.concurrent.Executers;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Service extends Thread {

    private Thread t;
    private String threadName;

    /*
     * 0 is Timer
     * 1 is CreateData
     * 2 is CreateThenDeleteData
     * 3 is CreateAndDeleteNodes
     * 4 is CreateAndDeleteLists
     * 5 is CreateAndDeleteCycles
    */
    private int serviceType;

    Service(String threadName, int serviceType){

        this.threadName = threadName;
        this.serviceType = serviceType;

        System.out.println("Creating " + threadName);

    }

    public void run(){

        System.out.println("Running " + threadName + " for " + serviceType);
        try {
            if(serviceType == 0){
                ScheduledExecutorService execService = Executers.newScheduledThreadPool(5);
                execService.scheduleAtFixedRate(()->{
                    System.out.println("Service run at: " + new java.util.Date());
                    }, 0, 100L, TimeUnit.MILISECONDS);
            } else if(serviceType == 1){
                CreateData cd = new CreateData();
            } else if(serviceType == 2){
                CreateThenDeleteData ctdd = new CreateThenDeleteData();
            } else if(serviceType == 3){
                CreateAndDeleteNodes cadn = new CreateAndDeleteNodes();
            } else if(serviceType == 4){
                CreateAndDeleteLists cadl = new CreateAndDeleteLists();
            } else if(serviceTpye == 5){
                CreateAndDeleteCycles cadc = new CreateAndDeleteCycles();
            } else {
                System.out.println(serviceType + " is not a valid service type input");
            }
        } catch (InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");

    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class ScheduledService {

    public static void main(String args[]){

        Service timer = new Service("Timer-thread", 0);
        Service data = new Service("Data-thread", 4);

    }

}
