public class Node {

    private Node nextNode;
    private int someNumber;
    private int someString;

    Node(){
        someNumber = 516;
        someString = "Hello.";
    }

    Node(int someNumber, String someString){
        this.someNumber = someNumber;
        this.someString = someString;
    }

    public getNextNode(){
        return this.nextNode;
    }

    pubic setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

}
