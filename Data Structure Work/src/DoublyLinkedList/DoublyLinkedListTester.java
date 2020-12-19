package DoublyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTester {

	@Test
	void push_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.push(3);
		d_list.push(4);
		d_list.push(5);
				
		assertEquals(3, d_list.size());
	}
	
	@Test
	void push_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.push(1);
		d_list.push(2);
		d_list.push(3);
		d_list.push(4);
		d_list.push(5);
		d_list.push(6);
		d_list.push(7);
		d_list.push(8);
		d_list.push(9);
		d_list.push(10);
		d_list.push(11);
		d_list.push(12);

		
		assertEquals(12, d_list.size());
	}
	
	@Test
	void append_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		
		assertEquals(3, d_list.size());
	}
	
	@Test
	void append_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		d_list.append(12);
		
		
		
		assertEquals(12, d_list.size());
	}
	
	
	@Test
	void first_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [[3]->[4]->[5]->null
		 */

		
		assertEquals(3, d_list.first());
	}
	
	@Test
	void first_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		d_list.append(12);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->[12]->null
		 */
		
		assertEquals(1, d_list.first());
	}
	
	@Test
	void first_test03() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.push(2);
		d_list.append(6);
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->[6]->null
		 */
		
		
		assertEquals(2, d_list.first());
	}
	
	@Test
	void first_test04() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.push(0);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
	
		assertEquals(0, d_list.first());
	}
	
	@Test
	void last_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [[3]->[4]->[5]->null
		 */

		
		assertEquals(5, d_list.last());
	}
	
	@Test
	void last_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		d_list.append(12);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->[12]->null
		 */
		
		assertEquals(12, d_list.last());
	}
	
	@Test
	void last_test03() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.push(2);
		d_list.append(6);
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->[6]->null
		 */
		
		
		assertEquals(6, d_list.last());
	}
	
	@Test
	void last_test04() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.push(0);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
		
		assertEquals(11, d_list.last());
	}
	
	@Test
	void removeFirst_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.removeFirst();
		
		/*
		 * List looks like..
		 * [4]->[5]->null
		 */
		

		
		assertEquals(4, d_list.first());
	}
	
	@Test
	void removeFirst_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		d_list.append(12);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->[12]->null
		 */
		
		d_list.removeFirst();
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->[12]->null
		 */
		
		assertEquals(2, d_list.first());
	}
	
	@Test
	void removeFirst_test03() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.push(2);
		d_list.append(6);
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->[6]->null
		 */
		
		d_list.removeFirst();
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->[6]->null
		 */
		
		
		assertEquals(3, d_list.first());
	}
	
	@Test
	void removeFirst_test04() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.push(0);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
		d_list.removeFirst();
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
		
		assertEquals(1, d_list.first());
	}
	
	@Test
	void removeLast_test01() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.removeLast();
		
		/*
		 * List looks like..
		 * [3]->[4]->null
		 */
		
		
		
		assertEquals(4, d_list.last());
	}
	
	@Test
	void removeLast_test02() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		d_list.append(12);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->[12]->null
		 */
		
		d_list.removeLast();
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
		assertEquals(11, d_list.last());
	}
	
	@Test
	void removeLast_test03() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		
		/*
		 * List looks like..
		 * [3]->[4]->[5]->null
		 */
		
		d_list.push(2);
		d_list.append(6);
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->[6]->null
		 */
		
		d_list.removeLast();
		
		/*
		 * List looks like..
		 * [2]->[3]->[4]->[5]->null
		 */
		
		
		assertEquals(5, d_list.last());
	}
	
	@Test
	void removeLast_test04() {
		DoublyLinkedList d_list = new DoublyLinkedList();
		d_list.append(1);
		d_list.append(2);
		d_list.append(3);
		d_list.append(4);
		d_list.append(5);
		d_list.append(6);
		d_list.append(7);
		
		/*
		 * List looks like..
		 * [1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.push(0);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]-> null
		 */
		
		d_list.append(8);
		d_list.append(9);
		d_list.append(10);
		d_list.append(11);
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->[11]->null
		 */
		
		d_list.removeLast();
		
		/*
		 * List looks like..
		 * [0]->[1]->[2]->[3]->[4]->[5]->[6]->[7]->[8]->[9]->[10]->null
		 */
		
		
		assertEquals(10, d_list.last());
	}
	
	
	

}
