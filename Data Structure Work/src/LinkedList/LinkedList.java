package LinkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	LinkedList(){
		this.head = null;
		this.tail = this.head;
		this.size = 0;
	}
	
	public void push(Object item) {
		Node node = new Node(item);
		node.next = head;
		head = node;
		
		
		
	}
	
	public void printList() {
		Node curr = this.head;
		while(curr != null) {
			System.out.println(curr.value + ", ");
		}
	}
	
	
}
