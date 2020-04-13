
//Learn String

package classroomassignment;

public class W1D3LearnString {
	
	public static void main(String[] args){

		//Way1 - Literal
		String txt = "TestLeaf";
		String txt1 = "ver 2.0";
		int ph = 12345;
		System.out.println(txt);
		
		//Way2 - Object
		String obj = new String("TestLeaf");
		System.out.println(obj);
	
		//To find count of the string
		int count = txt.length();
		System.out.println(count);
		
		//charAt - this method picks any single char based on Index num. Index starts with zer0
		//txt.charAt(index); 
		//For string TestLeaf. "t" index num of t is 3
		char ch = txt.charAt(3);
		System.out.println(ch);
			
		//To find position of the character, case sensitive, first char wud be taken, travels left to right
		int indexnum = txt.indexOf('s');
		System.out.println(indexnum);
		
		//Last Index of - Travels Right to Left
		int lastIndexOf = txt.lastIndexOf('s');
		System.out.println(lastIndexOf);
		
		//To remove the white space before and after
		String trim = txt.trim();
		System.out.println(trim);
		
		System.out.println(txt.concat(txt1));
		//System.out.println(txt + txt1);
		
		System.out.println(txt + ph);
		
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
		
		//inbuilt to convert the given string into CharArray
		char[] charArray = txt.toCharArray();
		System.out.println(charArray[7]);
		
		//split the words based on the given delimeter
		String[] split = txt.split("");
		System.out.println(split[2]);
		
		String substring = txt.substring(15);
		System.out.println(substring);
		
		String substring2 = txt.substring(15, txt.length()-1);
		System.out.println(substring2);
		
		System.out.println(txt1.equals("Ver 2.0"));
		
		System.out.println(txt1.equalsIgnoreCase("Ver 2.0"));
		
		System.out.println(txt1.startsWith("ve"));
		
		System.out.println(txt1.endsWith("0"));
		
		System.out.println(txt1.replace('v', 'V'));
		
		
		
	}
	
	

}
