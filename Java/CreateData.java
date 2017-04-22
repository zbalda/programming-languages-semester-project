import java.util.*;

public class CreateData {

    public static void main(String[] args){

        CreateData createData = new CreateData();
        createData.createData(1000);

    }

    void createData(int amount){
        
        Random rand = new Random();
        LinkedList myList = new LinkedList();
        int tempInt;
        for(int i = 0; i < amount; i++){
            tempInt = rand.nextInt(2147483647);
            Node temp = new Node(tempInt);
            myList.insertAtBeginning(temp);
        }

        // TEMP TEST
        System.out.println("Created Linked List of " + amount + " ints.");
        Node temp = new Node();
        myList.insertAtEnd(temp);
        System.out.println("Inserted node at end of list.");
        myList.removeFirst();
        System.out.println("Removed first node in list.");
        myList.removeLast();
        System.out.println("Removed last node in list.");
        myList.clear();
        System.out.println("Cleared list");

    }

}
