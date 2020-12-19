package DoublyLinkedList;

public class DNode {
	protected Object value;
	protected DNode next;
	protected DNode prev;
	
	public DNode(Object value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	public DNode() {
		this.next = null;
		this.prev = null;
	}
}
