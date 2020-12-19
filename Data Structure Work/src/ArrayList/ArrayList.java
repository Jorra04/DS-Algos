package ArrayList;

import java.util.Arrays;

public class ArrayList<E> {
	private Object[] list;
	private int size;
	private static final int INIT_CAP = 10;
	
	public ArrayList() {
		this.size = 0;
		this.list = new Object[INIT_CAP];
	}
	
	public int size() {
		return this.size;
	}
	
	public Object get(int index) {
		try {
			return list[index];
		}
		catch(Exception e) {
			throw new IndexOutOfBoundsException("The given index was out of bounds");
			
		}
	}
	
	public void add(E item) {
		if(this.list.length == this.size) {
			ensureCapacity();
		}
		this.list[this.size++] = item;
	}
	
	public void remove(E item) {
		if(this.size <= this.list.length /2) {
			reduceCapacity();
		}
		int temp_size = this.size;
		for(int i = 0; i < temp_size; i ++) {
			if(this.list[i].equals(item)) {
				this.list[i] = null;
				this.size --;
			}
		}
		int index = 0;
		for(Object element : this.list) {
			if( element != null) {
				list[index++] = element;
			}
		}
	}
	
	public void removeIndex(int index) {
		try {
			if(this.size <= this.list.length /2) {
				reduceCapacity();
			}
			this.list[index] = null;
			this.size--;
			int dummy_index = 0;
			for(Object element : this.list) {
				if( element != null) {
					list[dummy_index++] = element;
				}
			}
		}
		catch(Exception e) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
	}
	
	
	
	public boolean contains(E item) {
		for(int i = 0; i < this.size; i ++) {
			if(this.list[i].equals(item)) return true;
		}
		
		return false;
	}
	@Override
	public String toString() {
		String output = "";
		for(int i = 0; i < this.size; i ++) {
			if(i == this.size -1) {
				output += this.list[i];
			}
			else {
				output += this.list[i] + ", ";
			}
		}
		return output;
	}
	
	private void ensureCapacity() {
		int new_size = this.list.length * 2;
		Arrays.copyOf(this.list, new_size);
	}
	private void reduceCapacity() {
		int new_size = this.list.length /2;
		Arrays.copyOf(this.list, new_size);
	}
	

}
