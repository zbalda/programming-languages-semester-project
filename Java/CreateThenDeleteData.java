import java.util.*;

public class CreateThenDeleteData {

    public static void main(String[] args){

        CreateThenDeleteData createThenDeleteData = new CreateThenDeleteData();
        createThenDeleteData.createThenDeleteData(10000, 1);
        createThenDeleteData.createThenDeleteAllData(10000, 1);

    }

    void createThenDeleteData(int amount, int delayMiliSec){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            sleep(delayMiliSec);
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
        }
        for(int i = 0; i < amount; i++){
            sleep(delayMiliSec);
            myList.removeFirst();
        }
    
    }

    void createThenDeleteAllData(int amount, int delayMiliSec){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            sleep(delayMiliSec);
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
        }
        myList.clear();
    
    }
    
    void sleep(int miliseconds){

        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    
    }

}
