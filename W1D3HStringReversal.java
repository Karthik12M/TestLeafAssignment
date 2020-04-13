/*
 * Write a program to reverse a given string
 * input string txt = "welcome"
 * output --> emoclew
 */

package homeworkassignment;

public class W1D3HStringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt="Welcome";	
		
		char[] charArray = txt.toCharArray();
		
		int length=charArray.length;
		System.out.println(length);
		String reversetext="";
		
		for (int i = length-1; i >=0 ; i--) {
		
		reversetext=reversetext+Character.toString(charArray[i]);
			
		}
		System.out.println(reversetext);
		}
	}