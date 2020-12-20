package Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void enqueue_test01() {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(8);
		
//		q.printQueue();
//		System.out.println(q.rear());
//		System.out.println(q.front());
		
		assertEquals(8, q.front());
	}
	
	@Test
	void enqueue_test02() {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(8);
		q.enQueue(8);
		q.enQueue(9);
		
		assertEquals(9, q.front());
	}
	
	
	@Test
	void dequeue_test01() {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(8);
		
		q.deQueue();
		
		assertEquals(6, q.rear());
	}
	
	@Test
	void dequeue_test02() {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(8);
		q.enQueue(8);
		q.enQueue(9);
		
		q.deQueue();
		
		assertEquals(6, q.rear());
	}

}
