package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;
		int len = str.length();
		if (len >= 3 && len % 2 == 1) {
			int midIndex = len/2;
			String middleWords = result.substring(midIndex-1,midIndex+2);
			result = middleWords;
		}
		return result;
	}
	
	
	
	
	
	
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}
