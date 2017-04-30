import java.util.concurrent.Executors;
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
        // try {
            if(serviceType == 0){
                ScheduledExecutorService execService = Executors.newScheduledThreadPool(5);
                execService.scheduleAtFixedRate(()->{
                    System.out.println(System.currentTimeMillis());
                    }, 0, 10L, TimeUnit.MILLISECONDS);
            } else if(serviceType == 1){
                CreateData cd = new CreateData();
                cd.createData(100000, 1);
                System.out.println("Create Data test finished.");
            } else if(serviceType == 2){
                CreateThenDeleteData ctdd = new CreateThenDeleteData();
                ctdd.createThenDeleteData(100000, 1);
                ctdd.createThenDeleteAllData(100000, 1);
                System.out.println("Create then Delete Data test finished.");
            } else if(serviceType == 3){
                CreateAndDeleteNodes cadn = new CreateAndDeleteNodes();
                cadn.createAndDeleteNodes(10000, 100000, 1, 2);
                System.out.println("Create and Delete Nodes test finished.");
            } else if(serviceType == 4){
                CreateAndDeleteLists cadl = new CreateAndDeleteLists();
                cadl.createAndDeleteLists(10000, 100, 100000, 1, 2);
                System.out.println("Create and Delete Lists test finished.");
            } else if(serviceType == 5){
                CreateAndDeleteCycles cadc = new CreateAndDeleteCycles();
                cadc.createAndDeleteCycles(10000, 100, 100000, 1, 2);
                System.out.println("Create and Delete Cycles test finished.");
            } else {
                System.out.println(serviceType + " is not a valid service type input");
            }
            // throw new MyInterruptedException("MyInterruptedException.");
        // } catch (MyInterruptedException e){
        //     System.out.println("Thread " + threadName + " interrupted.");
        // }
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
        Service data = new Service("Data-thread", 4); // also test for 1-5

        timer.start();
        data.start();

    }

}
