import java.util.*;

public class CreateData {

    public static void main(String[] args){

        CreateData createData = new CreateData();
        createData.createData(10000, 1);

    }

    void createData(int amount, int delayMiliSec){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            sleep(delayMiliSec);
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
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
