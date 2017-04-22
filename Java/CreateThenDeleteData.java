import java.util.*;

public class CreateThenDeleteData {

    public static void main(String[] args){

        CreateThenDeleteData createThenDeleteData = new CreateThenDeleteData();
        createThenDeleteData.createThenDeleteData(1000);
        createThenDeleteData.createThenDeleteAllData(1000);

    }

    void createThenDeleteData(int amount){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
        }
        for(int i = 0; i < amount; i++){
            myList.removeFirst();
        }
    
    }

    void createThenDeleteAllData(int amount){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
        }
        myList.clear();
    
    }

}
