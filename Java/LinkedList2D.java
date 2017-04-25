public class LinkedList2D {

    private Node2D first;

    /* default constructor: list is empty */
    LinkedList2D(){
        this.first = null;
    }

    /* overloaded constructor: list is set for an intial first node */
    LinkedList2D(Node2D first){
        this.first = first;
    }

    /* inserts a node at the beginning of the list */
    public void insertAtBeginning(Node2D node){
        node.setNextNode(first);
        first = node;
    }

    /* inserts a node at the end of the list */
    public void insertAtEnd(Node2D node) {
        if(first == null) {
            first = node;
        } else {
            Node2D temp = first;
            while(temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(node);
        }
    }

    /* deletes the first node in the list */
    public Node2D removeFirst(){
        if(first == null){
            return null;
        } else {
            Node2D temp = first;
            first = first.getNextNode();
            return temp;
        }
    }

    /* deletes the last node in the list */
    public Node2D removeLast(){
        if(first == null){
            return null;
        } else if (first.getNextNode() == null){
            Node2D temp = first;
            first = null;
            return temp;
        } else {
            Node2D temp1 = first;
            Node2D temp2 = first.getNextNode();
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



