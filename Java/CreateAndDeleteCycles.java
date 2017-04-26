import java.util.*;

public class CreateAndDeleteCycles {

    public static void main(String[] args){

        CreateAndDeleteCycles createAndDeleteCycles = new CreateAndDeleteCycles();
        createAndDeleteCycles.createAndDeleteCycles(10000, 100, 10000, 1, 2);

    }

    /* creates and deletes list cycles from linked list
      * initSize: size list cycle is to be initially populated to
      * listSize: size of list cycles in the list
      * inserts: number of list cycles to be inserted after initial list is created
      * delayMiliSec: delay time between insertions and deletions (for VisualGC)
      * rate: creation to deletion ratio (e.g. 2 -> two inserts for every one deletion)
    */
    public void createAndDeleteCycles(int initSize, int listSize, int inserts, int delayMiliSec, int rate){
        
        LinkedList2D myList = new LinkedList2D();
        
        // populate list to initial size
        for(int i = 0; i < initSize; i++){
            Node2D temp = new Node2D();
            temp.populateCycle(listSize);
            myList.insertAtBeginning(temp);
        }

        // insert lists at end while deleting lists from beginning
        for(int i = 0; i < inserts; i++){
            for(int j = 0; j < rate; j++){
                sleep(delayMiliSec);    
                Node2D temp = new Node2D();
                temp.populateCycle(listSize);
                myList.insertAtEnd(temp);
            }
            sleep(delayMiliSec);
            myList.removeFirst();
        }


    }
    
    void sleep(int miliseconds){

        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    
    }

}
