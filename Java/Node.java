public class Node {

    private Node nextNode;
    private int someNumber;

    Node(){
        someNumber = 516;
    }

    Node(int someNumber){
        this.someNumber = someNumber;
    }

    public getNextNode(){
        return this.nextNode;
    }

    pubic setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

}
