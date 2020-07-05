
// Now I am going to write code to discard all second, third and so on duplicates in a string
// This is a code to remove duplicates from a string
/*
 * ALGORITHM 1:
 * 
 * The logic that i am going to implement is:
 * add the character in to a new string, if that character is in the newly formed string then we discard it.
 * Finally after traversing the whole string, we get a new string which is required
 * 
 * ALGORITHM 2 ( Efficient one, O(1) space and O(n) time complexity ):
 * 
 * Adding the alphabet in to map and printing
 * Next time before adding in to map, search if it is in map, if not, add to map and print
 * If it is there in map, then increment count and do not print. Maintaining map is not so efficient. Space complexity issue
 */

import java.util.HashMap;

public class RemoveDuplicates {
  public static void main(String []args) {
	  String input_string = "Mississippi";
	  System.out.println("I will traverse the string");
	  HashMap<Character, Integer> map = new HashMap<>();
	  int count = 0;
	  for(int index = 0; index < input_string.length(); index++) {
		  
		  if(! map.containsKey(input_string.charAt(index))) {
			  map.put(input_string.charAt(index), count++);
			  System.out.println(input_string.charAt(index));
		  }
		  else {
			 map.put(input_string.charAt(index),  map.get(input_string.charAt(index)) + 1);
			 
		  }
		 
	  }
    }
}
