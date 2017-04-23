import java.util.*;

public class CreateAndDeleteNodes {

    public static void main(String[] args){

        CreateAndDeleteNodes createAndDeleteNodes = new CreateAndDeleteNodes();
        createAndDeleteNodes.createAndDeleteNodes(10000, 10000, 1, 2);

    }

    /* creates and deletes nodes from linked list
      * initSize: size list is to be initially populated to
      * inserts: number of nodes to be inserted after initial array is created
      * delayMiliSec: delay time between insertions and deletions (for VisualGC)
      * rate: creation to deletion ratio (e.g. 2 -> two inserts for every one deletion)
    */
    void createAndDeleteNodes(int initSize, int inserts, int delayMiliSec, int rate){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        
        // populate list to initial size
        for(int i = 0; i < initSize; i++){
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp); 
        }

        // insert nodes at end while deleting nodes at beginning
        for(int i = 0; i < inserts; i++){
            for(int j = 0; j < rate; j++){
                sleep(delayMiliSec);
                tempInt = rand.nextInt(2147483647);
                Node temp = new Node(tempInt);
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
