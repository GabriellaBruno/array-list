/* 
 * Gabriella Bruno
 * Lab 4
 * Title: StringArrayList.java
 * Description: methods for and ArrayList (can be used for both String and integer)
 * Date: 9/21/25
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrayList<E> implements MyList<E> {

	private E[] theData;
	private static final int INITIAL_CAPACITY = 5;
	private int capacity = 0; //current size of internal array
	private int size = 0; //num of elements on the list
	
	public StringArrayList() {
		theData = (E[])new Object[INITIAL_CAPACITY];
		capacity = INITIAL_CAPACITY;
	}

	private void reallocate() {
		capacity = capacity * 2;
		theData = Arrays.copyOf(theData, capacity);
		//create a new internal array with double capacity
		//copy existing elements to the new internal array
	}
	
	@Override
	public void add(int index, E value) {
		if(index <0 || index > size)
			throw new ArrayIndexOutOfBoundsException(index);
		
		if(size >= capacity) {
			//internal array is full
			reallocate();
		}

		//shifting existing elements 
		for (int i = size-1; i>=index; i--) {
			theData[i+1] = theData[i];
			//to make a room for the new element, shifting 
			//starts from the end of the current list
		}
		
		theData[index] = value;
		size++;
	}
	
	public void traverse() {
		for (int i = 0 ; i < size; i++) {
			System.out.println(i + ": " + theData[i]);
		}
	}

	@Override
	public void add(E value) {
		if (size < capacity) {
			theData[size] = value; 
			size++;
		}
		else {
			reallocate();
			theData[size] = value; 
			size++;
		}
			

	}

	@Override
	public E remove(int index) {
		if(index <0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = theData[index];
		for(int i=index+1; i<size; i++) {
			theData[i-1] = theData[i];
			//to fill in the gap, shifting should 
			//start at position next to the index
		}
		size--;
		return oldValue;
	}

	@Override
	public E set(int index, E value) {
		if(index <0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = theData[index];
		theData[index] = value;
		return oldValue;
	}

	@Override
	public E get(int index) {
		if(index <0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}
	
	//lab 4 question 1
	public void deleteRange(int fromIndex, int toIndex) {
		 //removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive
		if (fromIndex < 0 || toIndex >= size) {
			throw new ArrayIndexOutOfBoundsException(toIndex);
		}
		for(int i = fromIndex; i < toIndex; i++) {
			for (int j = fromIndex+1; j < size; j++) {
				theData[j-1] = theData[j];
			}
			size--;
		}
	 }
	
	//lab 4 question 2
	public void deleteAll(E str) {
		 //removes from this list all of its elements whose values are str
		for (int i = size; i > 0; i--) {
			if (str.equals(theData[i])) {
				remove(i);
			}
		}
	 }
	 
	//lab 4 question 3
	 public int indexOf(E str) {
		 //returns the first occurrence of a given element, or returns -1 in case the element is not on the list
		 int location = -2;
		 boolean found = false;
		 
		 do {
			 for (int i = 0; i < size; i++) {
				 if(theData[i].equals(str)) {
					 location = i;
					 found = true;
					 break; //rather not use break, not sure why boolean isn't ending loop
				 } else {
					 location = -1;
					 found = true;
				 }
			 }
		 } while (found == false);
		
		 System.out.println("The first occurrence of " + str + " is at index " + location);
		 return location;
	 }
	 
		//lab 4 question 4
	 public int lastIndexOf(E str) {
		 //returns the last occurrence of a given element, or returns -1 in case the element is not on the list
		 int location = -1;
			 for (int i = 0; i < size; i++) {
				 if(theData[i].equals(str)) {
					 location = i;
				 }
			 }
			 System.out.println("The last occurrence of " + str + " is at index " + location);
			 return location;
	 }
	
}//end class
