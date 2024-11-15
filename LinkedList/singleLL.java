
class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

public class singleLL{

	Node head;
	
	
public void insertbeg(int data) {
	
	Node newNode = new Node(data);
	
	if(head==null) {
		System.out.println("empty");
		head = newNode;
		return;
	}
	
	newNode.next = head;
	head = newNode;
	
}

public void insertend(int data) {
	
	Node temp =head;
	
	Node newNode = new Node(data);
	
	while(temp.next!=null) {
		temp = temp.next;
	}
	
	temp.next =newNode;
	return;
}


public void insertmid(int data,int value) {
	Node temp =head;
	
	Node newNode = new Node(data);
	if(head == null) {
		System.out.println("List is empty, inserting at the beginning.");
		head = newNode;
		return;
	}
	
			while(temp.next!=null && temp.data!=value) {
				temp =temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return;
			
		}


public void deletebeg() {
	if(head ==null) {
		System.out.println("empty");
	}
	Node temp = head;
	
	head = head.next;

}

public void deleteend(int data) {
	
	if(head ==null) {
		System.out.println("empty");
		return;
	}
	if(head.next==null) {
		head = null;
		return;
	}
	
	Node temp =head;
	Node prev = head;
	
	while(temp.next!=null ) {
		prev = temp;
		temp = temp.next;
		
	}
	prev.next = null;
	return;
	
}

public void deletemid(int data , int value) {
	if(head==null) {
		System.out.println("empty");
	
	}
	
	Node temp=head;
	Node prev = head;
	
	while(temp.next!=null && temp.data!=value) {
		prev = temp;
		temp = temp.next;
	}
	
	if(temp.data ==value){
		prev.next= temp.next;
		temp.next=null;
	}
	
}
public void printList() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}


public static void main(String[] args) {
	singleLL sll = new singleLL();
	

    sll.insertbeg(11);
    sll.insertbeg(13);
    sll.insertend(59);
    sll.insertmid(30, 13);  // Inserts 30 after node with data 13

    System.out.println("List after insertions:");
    sll.printList();

    sll.deletebeg();
    System.out.println("List after deleting from beginning:");
    sll.printList();

 

    sll.deleteend(30);
    System.out.println("List after deleting value 30:");
    sll.printList();
}
}





























