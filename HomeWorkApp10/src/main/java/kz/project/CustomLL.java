package kz.project;

public class CustomLL {
    private Node head;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    public void addAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            Node currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }
        this.size++;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node currentNode = this.head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
        this.size++;
    }

    public void getByIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            System.out.println(this.head.getData());
            return;
        }

        Node currentNode = head;
        while (currentNode.getNextNode() != null) {
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.getNextNode();
            }
        }
        System.out.println(currentNode.getData());
    }

    public void remove(int data) {
        Node currentNode = this.head;
        if (currentNode.getData() == data) {
            removerFirst();
            return;
        }
        while (currentNode.getNextNode() != null) {
            if (currentNode.getNextNode().getData() == data) {
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        this.size--;
    }

    public void removerFirst() {
        this.head = this.head.getNextNode();
        this.size--;
    }

    public void print() {
        if (this.head != null) {
            Node currentNode = this.head;
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
