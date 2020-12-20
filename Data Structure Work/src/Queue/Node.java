package Queue;

public class Node {
	Object value;
	Node next;
	
	public Node() {
		this.next = null;
	}
	
	public Node(Object value) {
		this.value = value;
		this.next = null;
	}
}
