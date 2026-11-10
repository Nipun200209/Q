
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    Node head;

    // Insert at Beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at End
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at Specific Index
    void insertAtIndex(int data, int index) {

        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Index");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Delete a Node
    void deleteNode(int data) {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        if (temp == head) {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Display Forward
    void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display Backward
    void displayBackward() {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.insertAtIndex(25, 2);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        list.deleteNode(25);

        System.out.println("After Deletion:");
        list.displayForward();
    }
}
