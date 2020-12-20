package Queue;


public class Queue {
	private Node rear;
	private Node front;
	private int size;
	
	public Queue() {
		this.front = null;
		this.rear = this.front;
		this.size = 0;
	}
	
	/*
	 * Section 1. Methods responsible for adding to the LinkedList
	 * contains enQueue which adds to the back of the Queue
	 * 
	 */
	
	public void enQueue(Object item) {
		Node node = new Node(item);
		if(this.size == 0) {
			this.front = this.rear = node;
			this.front.next = null;
		}
		else {
			node.next = this.front;
			this.front = node;
		}
		this.size ++;
	}
	
	/*
	 * Section 2. Methods responsible for removing from the LinkedList
	 * contains deQueue
	 * Runtime of 
	 */
	
	public void deQueue() throws EmptyListException{
		
		if(this.size == 0) {
			throw new EmptyListException("Cannot deQueue, queue is empty");
		}
		
		Node curr = this.front;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		this.size --;
	}
	
	/*
	 * Section 3. Methods in this section are responsible for getting data
	 * about the data structure.
	 * All functions in this section are o(1)
	 */
	
	public Object rear() {
		return this.rear.value;
	}
	
	public Object front() {
		return this.front.value;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	
	/*
	 * Section 4. This section is responsible for keeping tabs on the DS and ensuring 
	 * it is behaving to our expectations.
	 * the PrintQueue() function has a runtime of o(n)  
	 */
	
	public void printQueue() {
		Node curr = this.front;
		while(curr != null) {
			if(curr == rear) {
				System.out.print(curr.value);
			}
			else {
				System.out.print(curr.value + ", ");
			}

			curr = curr.next;
		}
	}

	
}
