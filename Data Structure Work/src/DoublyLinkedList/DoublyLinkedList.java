package DoublyLinkedList;

public class DoublyLinkedList {
	private DNode head;
	private DNode tail;
	private int size;
	
	public DoublyLinkedList() {
		this.head = new DNode();
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
		DNode node = new DNode(item);
		if(this.size == 0) {
			this.head = this.tail = node;
		}
		else{
			node.prev = null;
			node.next = this.head;
			this.head.prev = node;
			this.head = node;	
		}
		this.size ++;
	}
	
	public void append(Object item) {
		DNode node = new DNode(item);
		if(this.size == 0) {
			this.head = this.tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		this.size ++;
	}
	
	/*
	 * Section 2. Methods responsible for removing from the LinkedList
	 * contains removeFirst and removeLast.
	 * Runtime of removeFirst() is o(1)
	 * Runtime of removeLast() is o(1)
	 */
	
	public void removeFirst() throws EmptyListException {
		if(this.size == 0) {
			throw new EmptyListException("The List is Empty and removeFirst Cannot"
					+ " be used");
		}
		else {
			head = head.next;
			head.prev = null;
			this.size --;	
		}
	}
	
	public void removeLast() throws EmptyListException{
		if(this.size == 0) {
			throw new EmptyListException("The List is Empty and removeFirst Cannot"
					+ " be used");
		}
		tail = tail.prev;
		tail.next = null;
		this.size --;
	}
	
	
	/*
	 * Section 3. Methods in this section are responsible for getting data
	 * about the data structure.
	 * All functions in this section are o(1)
	 */
	
	public Object first() {
		return this.head.value;
	}
	
	public Object last() {
		return this.tail.value;
	}
	
	public int size() {
		return this.size;
	}
	
	/*
	 * Section 4. This section is responsible for keeping tabs on the DS and ensuring 
	 * it is behaving to our expectations.
	 * the PrintList() function has a runtime of o(n)  
	 */
	
	public void printList() {
		DNode curr = head;
		while(curr != null) {
			if(curr == tail) {
				System.out.print(curr.value);
			}
			else {
				System.out.print(curr.value +", ");
			}
			curr = curr.next;
		}
	}
	
}
