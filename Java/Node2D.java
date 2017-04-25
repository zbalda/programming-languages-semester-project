public class Node2D {

    private Node2D nextNode;
    private LinkedList list;

    Node2D(){
        this.list = new LinkedList();
    }

    Node2D(LinkedList list){
        this.list = list;
    }

    public Node2D getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node2D nextNode){
        this.nextNode = nextNode;
    }
    
    /* populates Node2D with list of given size */
    public void populateList(int size){
        Random rand = new Random();
        int tempInt;
        for(int i = 0; i < size; i++){
            tempInt = rand.nextInt(2147483647);   
            Node temp = new Node(tempInt);
            list.insertAtBeginning(temp);
        }
    }

    /* populates Node2D with cycle of given size */
    public void populateCycle(int size){
        Random rand = new Random();
        int tempInt;
        for(int i = 0; i < size-1; i++){
            tempInt = rand.nextInt(2147483647);   
            Node temp = new Node(tempInt);
            list.insertAtBeginning(temp);
        }
        Node temp = new Node(516);
        list.insertCycle(temp);
    }

}
