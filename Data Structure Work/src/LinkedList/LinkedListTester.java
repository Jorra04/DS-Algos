package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void add_test01() {
		LinkedList list = new LinkedList();
		list.push(5);
		list.push(4);
		/*
		 * List looks like..
		 * [5]->[4]-> null
		 */
		assertEquals(2, list.size());
	}
	
	@Test
	void add_test02() {
		LinkedList list = new LinkedList();
		
		list.push(4);
		list.push(5);
		list.append(3);
		list.append(2);
		
		/*
		 * List looks like..
		 * [5]->[4]->[3]->[2]-> null
		 */
		
		assertEquals(4, list.size());
	}
	
	@Test
	void getFirst_test01() {
		LinkedList list = new LinkedList();
		
		list.push(5);
		list.push(6);
		
		/*
		 * List looks like..
		 * [5]->[6]-> null
		 */
		assertEquals(6, list.first());
	}
	
	@Test
	void getFirst_test02() {
		LinkedList list = new LinkedList();
		
		list.append(5);
		list.append(6);
		list.push(4);
		
		/*
		 * List looks like..
		 * [4]->[5]->[6]-> null
		 */
		
		assertEquals(4, list.first());
	}
	
	@Test
	void removeFirst_test01() {
		LinkedList list = new LinkedList();
		
		list.append(5);
		list.append(6);
		list.push(4);
		
		/*
		 * List looks like..
		 * [4]->[5]->[6]-> null
		 */
		
		list.removeFirst();

		/*
		 * List looks like..
		 * [5]->[6]-> null
		 */
		
		assertEquals(5, list.first());
	}
	
	@Test
	void removeLast_test01() {
		LinkedList list = new LinkedList();
		
		list.push(4);
		list.push(5);
		list.append(3);
		list.append(2);
		
		/*
		 * List looks like..
		 * [5]->[4]->[3]->[2]-> null
		 */
		
		list.removeLast();
		
		/*
		 * List looks like..
		 * [5]->[4]->[3]-> null
		 */
	
		assertEquals(3, list.last());
	}

}
