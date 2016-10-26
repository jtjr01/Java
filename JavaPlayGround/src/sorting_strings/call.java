/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will ask a user for their name. Using set and get. Then it will
 * ask the user to enter words and it will sort alphabetically.
 * Then it will upper case the alphabetical words.
 */
package sorting_strings;

public class call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name user = new name();
		String a = "0";
		user.setname1(a);
		user.getname1();
		user.ask_user();
		sort string = new sort();
		string.getString();
		string.convert();
		string.sort();

	}

}
