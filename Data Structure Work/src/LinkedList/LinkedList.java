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
		if(this.size == 0) tail = head;
		this.size ++;
		
	}
	
	public void append(Object item) {
		Node node = new Node(item);
		this.tail.next = node;
		this.tail = node;
		this.size ++;
	}
	
	
	public int size() {
		return this.size;
	}
	
	public void printList() {
		Node curr = this.head;
		while(curr != null) {
			if(curr == tail) {
				System.out.print(curr.value);
			}
			else {
				System.out.print(curr.value + ", ");
			}
			
			curr = curr.next;
		}
	}
	
	
}
