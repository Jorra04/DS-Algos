package ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayList_tester {

	@Test
	void add_test01() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(5, myList.get(0));
	}
	
	@Test
	void add_test02() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(4, myList.get(1));
	}
	
	@Test
	void add_test03() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(3, myList.get(2));
	}
	
	@Test
	void size_test01() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(3, myList.size());
	}
	@Test
	void size_test02() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		assertEquals(2, myList.size());
	}
	@Test
	void size_test03() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		assertEquals(1, myList.size());
	}
	
	@Test
	void contains_test01() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(true, myList.contains(4));
	}
	
	@Test
	void contains_test02() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		assertEquals(false, myList.contains(1));
	}
	
	@Test
	void removeAll_test01() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		myList.add(5);
		myList.add(4);
		myList.add(3);
		myList.add(5);
		myList.add(4);
		myList.add(3);
	
		
		myList.remove(3);
		
		assertEquals(false, myList.contains(3));
	}
	
	@Test
	void removeAll_test02() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		myList.add(5);
		myList.add(4);
		myList.add(3);
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		
		myList.remove(5);
		
		assertEquals(false, myList.contains(5));
	}
	
	@Test
	void removeIndex_test01() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		
		myList.removeIndex(2);
	
		assertEquals(false, myList.contains(3));
		assertEquals(2, myList.size());
	}
	
	@Test
	void removeIndex_test02() {
		ArrayList<Integer> myList = new ArrayList();
		myList.add(5);
		myList.add(4);
		myList.add(3);
		
		
		myList.removeIndex(2);
		
	
		assertEquals(false, myList.contains(3));
		assertEquals(2, myList.size());
		myList.removeIndex(0);
		assertEquals(false, myList.contains(5));
		assertEquals(1, myList.size());
	}
	

}
