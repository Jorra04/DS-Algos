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
	/*
	 * Section 1. Methods responsible for adding to the LinkedList
	 * contains push and append.
	 * Runtime of push(Object item) is o(1)
	 * Runtime of append(Object item) is o(1)
	 */
	public void push(Object item) {

		Node node = new Node(item);
		node.next = head;
		head = node;
		if(this.size == 0) tail = head;
		this.size ++;
	}
	
	public void append(Object item) {
		Node node = new Node(item);
		if(this.size == 0) {
			this.head = this.tail = node;
		}
		
		this.tail.next = node;
		this.tail = node;
		this.size ++;
	}
	
	/*
	 * Section 2. Methods responsible for removing from the LinkedList
	 * contains removeFirst and removeLast.
	 * Runtime of removeFirst() is o(1)
	 * Runtime of removeLast() is o(n)
	 */
	
	public void removeFirst() {
		this.head = this.head.next;
		this.size --;
	}
	
	public void removeLast() {
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		tail = curr;
		tail.next = null;
		this.size --;
	}
	

	/*
	 * Section 3. Methods in this section are responsible for getting data
	 * about the data structure.
	 * All functions in this section are o(1)
	 */
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public Object first() {
		return this.head.value;
	}
	
	public Object last() {
		return this.tail.value;
	}
	
	/*
	 * Section 4. This section is responsible for keeping tabs on the DS and ensuring 
	 * it is behaving to our expectations.
	 * the PrintList() function has a runtime of o(n)  
	 */

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
