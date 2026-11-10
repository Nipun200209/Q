class Node{
	int Data;
	Node Next;
	
	Node(int Data){
		this.Data=Data;
		this.Next=null;
	}
}
class SingleLinkedList{
	Node head;
	void insertAtBegin(int Data){
		Node newNode=new Node(Data);
		newNode.Next=head;
		head=newNode;
	}
	//insert at end
	void insertAtEnd(int Data){
		Node newNode=new Node(Data);
		if(head==null){
			head=newNode;
			return;
		}
		
		Node temp=head;
		
		while(temp.Next!=null){
			temp=temp.Next;
			
		}
		temp.Next=newNode;
	}
	//delete node
	
	void deleteNode(int Data){
		if(head==null){
			return;
		}
		
		if(head.Data==Data){
			head=head.Next;
		}
			
			Node temp=head;
			
		while(temp.Next!=null && temp.Next.Data!=Data){
			temp=temp.Next;
		}
		if(temp.Next!=null){
			temp.Next=temp.Next.Next;
		}
	}// Display Linked List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        }

        System.out.println("null");
    }
	
	
	
}
	public class SingleLinkedList1 {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

        list.deleteNode(30);

        list.display();
    }
}
