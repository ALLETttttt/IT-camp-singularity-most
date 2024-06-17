package kz.project;

public class CustomLL {
    private Node head;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
        this.size++;
    }

    public void print() {
        if (head != null) {
            Node currentNode = head;
            System.out.print("[");
            while (currentNode.getNextNode() != null) {
                System.out.print(currentNode.getData() + ", ");
                currentNode = currentNode.getNextNode();
            }
            System.out.print(currentNode.getData() + "]");
        } else {
            System.out.println("[]");
        }
    }
}
