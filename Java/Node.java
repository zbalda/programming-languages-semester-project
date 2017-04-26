public class Node {

    private Node nextNode;
    private int someNumber;

    Node(){
        someNumber = 516;
    }

    Node(int someNumber){
        this.someNumber = someNumber;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

}
