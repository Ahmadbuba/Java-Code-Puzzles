package practice.recursion;

public class RecursionPractice {

	public static void main(String[] args) {
		
		System.out.println(printNumber(4)*8);
		System.out.println(fact(4));
		System.out.println(allDollars("hello")); // h$e$l$l$0
		System.out.println(allDollars("james")); // j$a$m$e$s

	}
	
	public static int printNumber(int num) {
		if(num == 0) {
			return 0;
		} else {
			// System.out.println(num);
			return printNumber(num-1);
		}
	}
	
	public static String allDollars(String str) {
		if(str.length() <= 1) return str;
		return str.charAt(0) + "$" + allDollars(str.substring(1));
	}
	
	public static int fact(int n) {
		if(n==0) return 1;
		return n * fact(n-1);
	}

}
