import java.util.*;

public class ScheduledService { 

    public static void main(String[] args){

        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(ScheduledService::myTask, 0, 1, TimeUnit.SECONDS);
    
    }
    
    private static void myTask() {
        
        System.out.println("Running");
    
    }

}
