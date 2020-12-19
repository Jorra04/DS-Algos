package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void add_test01() {
		LinkedList list = new LinkedList();
		list.push(5);
		list.push(4);
		
		assertEquals(2, list.size());
	}
	
	@Test
	void add_test02() {
		LinkedList list = new LinkedList();
		
		list.push(4);
		list.push(5);
		list.append(3);
		list.append(2);
		assertEquals(4, list.size());
	}

}
