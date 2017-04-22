public class LinkedList {

    private Node first;

    /* default constructor: list is empty */
    LinkedList(){
        this.first = null;
    }

    /* overloaded constructor: list is set for an intial first node */
    LinkedList(Node first){
        this.first = first;
    }

    /* inserts a node at the beginning of the list */
    public void insertAtBeginning(Node node){
        node.setNextNode(first);
        first = node;
    }

    /* inserts a node at the end of the list */
    public void insertAtEnd(Node node) {
        if(first == null) {
            first = node;
        } else {
            Node temp = first;
            while(temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(node);
        }
    }

    /* deletes the first node in the list */
    public Node deleteFirst(){
        if(first == null){
            return null;
        } else {
            Node temp = first;
            first = first.getNextNode();
            return temp;
        }
    }

    /* deletes the last node in the list */
    public Node deleteLast(){
        if(first == null){
            return null;
        } else if (first.getNextNode() == null){
            Node temp = first;
            first = null;
            return temp;
        } else {
            Node temp1 = first;
            Node temp2 = first.getNextNode();
            while(temp2.getNextNode() != null){
                temp1 = temp2;
                temp2 = temp2.getNextNode();
            }
            temp1.setNextNode(null);
            return temp2;
        }
    }

    /* clears the list by setting first to null */
    public void clear(){
        first = null;
    }

}



