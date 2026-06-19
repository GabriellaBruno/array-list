/* 
 * Gabriella Bruno
 * Lab 4
 * Title: MyList.java
 * Description: implements objects and methods for a specific MyList
 * Date: 9/21/25
 */
public interface MyList<E> {

	public void add(int index, E value);
	public void add(E value);
	public E remove(int index);
	public E set(int index, E value);
	public E get(int index);
}//end interface
