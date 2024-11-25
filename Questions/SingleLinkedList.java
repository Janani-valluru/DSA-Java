class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

public class SingleLinkedList {
	
	
	
private static Node head = null;

public static void insertAtBeg(int data) {

	Node newNode = new Node(data);
	
	if(head==null) {
		head=newNode;
		return;
	}
		newNode.next = head;
		head =newNode;
	
}

public static void insertEnd(int data) {
	Node newNode = new Node(data);
	
	Node temp=head;
	
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=newNode;
	return;
	
}

public static void insertmid(int data , int value) {
	
	Node temp=head;
	Node newNode = new Node(data);

	if(head==null) {
		head=newNode;
		return;
	}
	
	while(temp.next!=null || temp.data!=value) {
		temp =temp.next;
		
	}
	newNode.next = temp.next;
	temp.next= newNode;
	return;
}

public static void deletebeg(int data) {
	
	if(head==null) {
		System.out.println("empty");
		return;
	}
	
	Node temp = head;
	head=head.next;
	temp=null;
}

public static void deleteEnd(int data) {

	if(head==null) {
		System.out.println("empty");
		return;
	}
	
	if(head.next ==null) {
		head=null;
	}
	Node temp = head;
	Node prev = head;
	
	while(temp.next!=null) {
		prev=temp;
		temp=temp.next;
		
	}
	prev.next=null;
	return;
}
	
	
public static void deletemid(int data,int value) {

	if(head==null) {
		System.out.println("empty");
		return;
	}
	if(head.next ==null && head.data==value) {
		
		head=null;
		return;
	}
	Node temp = head;
	Node prev = head;
	
	while(temp.next!=null || temp.data!=value) {
		prev=temp;
		temp=temp.next;
		
	}
	
	if(temp.data ==value) {
		prev.next =temp.next;
		temp=null;
		
	}
	else {
		System.out.println("not found");
	}
	
}

public static void search(int value) {
	Node temp=head;
	
	while(temp!=null) {
		if(temp.data==value) {
			System.out.println("the value:"+temp.data);
		}
		
		temp=temp.next;
	}
	return;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	
}
}
