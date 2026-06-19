/* 
 * Gabriella Bruno
 * Lab 4
 * Title: TestProgram.java
 * Description: uses the methods for both String and integer ArrayLists
 * Date: 9/21/25
 */
public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringArrayList<String> testList = new StringArrayList<String>();
		testList.add("Alice");
		testList.add("Cher");
		testList.add("David");
		testList.add("Ellen");
		testList.add(1,"Bob");
		testList.remove(1);
		testList.add(4,"Joe");
		
		testList.add("Cher");

		
		
		testList.set(2, "Hugh");
		testList.add("Grace");
		testList.add("Kyle");
		
		testList.add("Joe");
		testList.add("Cher");
		testList.add("Cher");

		
		testList.traverse();
		//System.out.println("the element at index 3 is " + testList.get(3));
		
		StringArrayList<Integer> testList2 = new StringArrayList<Integer>();
		testList2.add(1);
		testList2.add(2);
		testList2.add(3);
		testList2.add(4);
		testList2.add(0,5);
		
		testList2.add(6);
		testList2.add(7);
		testList2.remove(5);
		
		testList2.add(4);
		testList2.add(4);
		testList2.add(4);
		
		testList2.traverse();
		

	

		
		
		System.out.println();
		
		//delete range
		/* String
		testList.deleteRange(3,5);
		testList.traverse();
		*/
		
		/* int
		testList2.deleteRange(5,8);
		testList2.traverse();
		 */
		
		//delete all
		/* String
		testList.deleteAll("Cher");
		testList.deleteAll("Bella");
		testList.traverse();
		*/
		
		/* int
		testList2.deleteAll(4);
		testList2.traverse();
		*/
		
		//index of
		/* String
		testList.indexOf("Cher");
		testList.indexOf("Joe");
		testList.indexOf("Bella");
		testList.indexOf("Alice");
		*/
		
		/* int
		testList2.indexOf(4);
		testList2.indexOf(7);
		testList2.indexOf(78);
		testList2.indexOf(1);
		testList2.indexOf(5);
		*/

		
		//last index of
		/* String
		testList.lastIndexOf("Cher");
		testList.lastIndexOf("Joe");
		testList.lastIndexOf("Bella");
		testList.lastIndexOf("Alice");
		*/
		
		/* int
		testList2.lastIndexOf(4);
		testList2.lastIndexOf(7);
		testList2.lastIndexOf(78);
		testList2.lastIndexOf(1);
		testList2.lastIndexOf(5);
		*/

		
	}//end main

}//end class

/*
 * console output:
 * 
 * delete range (String):
1: Cher
2: Hugh
3: Ellen
4: Joe
5: Cher
6: Grace
7: Kyle
8: Joe
9: Cher
10: Cher

0: Alice
1: Cher
2: Hugh
3: Cher
4: Grace
5: Kyle
6: Joe
7: Cher
8: Cher
 * 
 * delete range (integer):
0: 5
1: 1
2: 2
3: 3
4: 4
5: 7
6: 4
7: 4
8: 4

0: 5
1: 1
2: 2
3: 3
4: 4
5: 4
 * 
 * delete all (String):
0: Alice
1: Cher
2: Hugh
3: Ellen
4: Joe
5: Cher
6: Grace
7: Kyle
8: Joe
9: Cher
10: Cher

0: Alice
1: Hugh
2: Ellen
3: Joe
4: Grace
5: Kyle
6: Joe
 * 
 * delete all (integer):
0: 5
1: 1
2: 2
3: 3
4: 4
5: 7
6: 4
7: 4
8: 4

0: 5
1: 1
2: 2
3: 3
4: 7
 * 
 * index of (String):
The first occurrence of Cher is at index 1
The first occurrence of Joe is at index 4
The first occurrence of Bella is at index -1
The first occurrence of Alice is at index 0
 * 
 * index of (integer):
The first occurrence of 4 is at index 4
The first occurrence of 7 is at index 5
The first occurrence of 78 is at index -1
The first occurrence of 1 is at index 1
The first occurrence of 5 is at index 0
 * 
 * last index of (String):
The last occurrence of Cher is at index 10
The last occurrence of Joe is at index 8
The last occurrence of Bella is at index -1
The last occurrence of Alice is at index 0
 * 
 * last index of (integer):
The last occurrence of 4 is at index 8
The last occurrence of 7 is at index 5
The last occurrence of 78 is at index -1
The last occurrence of 1 is at index 1
The last occurrence of 5 is at index 0
 * 
 */

