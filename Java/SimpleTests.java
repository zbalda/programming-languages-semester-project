import java.util.*;

public class SimpleTests {

    public static void main(String[] args){

        SimpleTests test = new SimpleTests();

        test.sleep(20000);

        test.test1(2000000);
        test.test2(2000000);

    }

    /* adds n integers to a Java Linked List and then removes them one by one */
    void test1(int n){

        Random rand = new Random();
        LinkedList myList = new LinkedList();
        
        for(int i = 0; i < n; i++){
            int temp = rand.nextInt(2147483647);
            myList.add(temp);
            sleep(1);
        }
        System.out.println("Created list of " + n + " integers.");
        
        for(int i = 0; i < n; i++){
            myList.removeFirst();
            sleep(1);
        }
        System.out.println("Removed " + n + " integers one by one.");
        
    }

    /* adds n integers to a Java Linked List and then sets list to null */
    void test2(int n){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        
        for(int i = 0; i < n; i++){
            int temp = rand.nextInt(2147483647);
            myList.add(temp);
            sleep(1);
        }
        System.out.println("Created list of " + n + " integers (2nd time).");
        
        myList = null;
        System.out.println("Set list to null (removing entire list at once.)");

    }

    void sleep(int miliseconds){

        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    
    }

}
