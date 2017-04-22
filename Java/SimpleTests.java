import java.util.*;

class SimpleTests {

    public static void main(String[] args){

        SimpleTests test = new SimpleTests();

        test.test1(100000);
        test.test2(100000);

    }

    /* adds n integers to a Java Linked List and then removes them one by one */
    void test1(int n){

        Random rand = new Random();
        LinkedList myList = new LinkedList();
        
        for(int i = 0; i < n; i++){
            int temp = rand.nextInt(2147483647);
            myList.add(temp);
        }
        System.out.println("Created list of " + n + " integers.");
        
        for(int i = 0; i < n; i++){
            myList.removeFirst();
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
        }
        System.out.println("Created list of " + n + " integers (2nd time).");
        
        myList = null;
        System.out.println("Set list to null (removing entire list at once.)");

    }

}
