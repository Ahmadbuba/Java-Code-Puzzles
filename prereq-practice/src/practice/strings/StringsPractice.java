package practice.strings;

public class StringsPractice {
	public static void main(String[] args) {
//		System.out.println("hello world");
		
		String str = "Hello there yogi there";
		
		int a = str.indexOf("there",7);
		
		int d = str.lastIndexOf("there");
		
		int b = str.indexOf("there");
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
	}
}
