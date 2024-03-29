package intro_to_array_lists;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		String[] strings;
		// 2. Add five Strings to your list
		strings = new String[5];
		strings[0] = "ccc";
		strings[1] = "ggg";
		strings[2] = "zzz";
		strings[3] = "cfq";
		strings[4] = "cfm";
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.length; i=i+2) {
			System.out.println(strings[i]);
		}
		// 6. Print all the Strings in reverse order.
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].contains("e")) {
				System.out.println(strings[i]);
			}
		}
	}
}
