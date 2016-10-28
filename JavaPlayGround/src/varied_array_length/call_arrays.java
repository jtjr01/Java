/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will make an array that has a set amount of rows but
 * each row has a varied length. After the first one is created, it 
 * is copied to another one and then added. At the end all three
 * are printed out.
 */

package varied_array_length;

public class call_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array_work arr = new array_work();
		arr.fill_array();
		arr.copy_array();
		arr.add_arrays();
		arr.print();

	}

}
