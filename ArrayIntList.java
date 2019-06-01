import java.util.Arrays;


//ArrayIntList stores and works with a list of integers
public class ArrayIntList { 
	
	
	public static void main(String[] args) {
		
		
		int[] data = { 1, 2, 3, 4, 5, 3 };

		ArrayIntList list = new ArrayIntList();
		
		
		
		for (int n : data) {
			list.add(n);
		}

		// first test
		System.out.println("list: " + list);
		// ok so add method works and toString method works...

		
		
		// remove the 0s and calculate the product of the rest
		ArrayIntListIterator i = list.iterator();
		
		int product = 1;
		while(i.hasNext()) {
			int n = i.next();
			if (n == 0) {
				i.remove();
			} else {
				product *=n;
			}
		}

		
	// replace value of 3 in list with value of 5	
		list.replaceAll(3, 5);
	// see the result of above replaceAll method call on list
		System.out.println("list replaceAll result: " + list);
	}

	
	// arraylist can work with primitive int instead of Integer
	private int[] elementData;
	private int size;
	
	// constant. so the size can be 0, but it has the capacity to hold 100 elements
	public static final int DEFAULT_CAPACITY = 100;
	
	
	// constructor
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayIntList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("Capacity : " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
		
		
	}
	
	// returns the size (not capacity), current elements in the list
	public int size() {
		return size;
	}
	
	// return the integer at a given index
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	// check if the index in bounds
	private void checkIndex(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index " + index);
		}
	}
	// is the list empty
	public boolean isEmpty() {
		return size == 0;
	}
		
		
	
	// create a bracketed string representation of the list
	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			
			String result ="[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
		
		result +="]";
	
		return result; 
		}
	}
	
	
	// maybe related to homework a little bit:
	// return the position of the first occurrence of a value (by convention, -1 if not found)
	public int indexOf(int value) {
		for(int i = 0; i < size; i++) {
			if(elementData[i] == value) {
				return i;
			}
		}
		return -1; // value not found
	}
	
	
	// returns true if a value is contained in the arraylist; false otherwise
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}
	
	// append a value to the end of the list
	public void add(int value) {
		ensureCapacity(size + 1);
		elementData[size] = value;
		size++;
	}
	
	//ensure that the array capacity is sufficient, if not, the size will be doubled or more
	private void ensureCapacity(int capacity) {
		if(capacity > elementData.length) { 
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity) {
				newCapacity = capacity;
			}
			
			elementData = Arrays.copyOf(elementData,  newCapacity);
			}
			
		}
	
		
		// insert a given value at a given index; must shift the subsequent values to the right
		public void add(int index, int value) {
			if (index < 0 || index > size) {
				throw new IndexOutOfBoundsException("index " + index);
			}
			ensureCapacity(size + 1);
			for(int i = size; i > index; i--) {
				elementData[i] = elementData[i - 1];
			}
			elementData[index] = value;
			size++;
		}
		
		// remove a value at a specified index, shift values to the left
		public void remove(int index) {
			checkIndex(index);
			for(int i = index; i < size -1; i++) {
				elementData[i] = elementData[i+1];
				
			}
			size --;
			
		}
		
		// replace the value at a given index with the new value
		public void set(int index, int value) {
			checkIndex(index);
			elementData[index] = value;
		}
		
		
		/*
		 * Write a method named replaceAll that takes in two integers 
		 * as parameters, and returns a new array with the replaced values, 
		 * for example

		list.replaceAll(3, 5) would turn the original array [1, 2, 3, 4, 5, 3] 
		into [1, 2, 5, 4, 5, 5] because it replaces all the values of 3, with 5.

		Add this method onto the ArrayIntList class.`

		 */
		
		public int[] replaceAll(int oldValue, int newValue) {
				for(int i = 0; i < size; i++) {
					if(get(elementData[i]) == oldValue) {
						set(elementData[i], newValue);
					}
				}
				return elementData;
		}
		
		
		
		
		// append all values from a given list to the end of this list
		public void addAll(ArrayIntList other) {
			ensureCapacity(size + other.size());
			for(int i = 0; i < other.size(); i++) {
				add(other.elementData[i]);
			}
		}
			
	
		// return an iterator for the list
		public ArrayIntListIterator iterator() {
			return new ArrayIntListIterator(this);
		}
	
	
	
}
	
	

	
	
