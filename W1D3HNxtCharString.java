/*
/* Write a program to print next char of given string?
 * input string txt = "A1B2C3";
 * Output "B2C3D4";
 */


package homeworkassignment;

public class W1D3HNxtCharString {

			public static void main(String[] args) {
			// TODO Auto-generated method stub

			String txt="A1B2C3";
			char[] charArray = txt.toCharArray();
			int length = charArray.length;
			System.out.println(length);
			//int txt1 =txt.length();
			//System.out.println(txt1);
					
			
			String newtxt="";
			for (int i = 0; i < length; i++) {
			
				int temp=charArray[i];
				temp=temp+1;
				newtxt=newtxt+(char)temp;
				
			}
			System.out.println(newtxt);
		}

	}