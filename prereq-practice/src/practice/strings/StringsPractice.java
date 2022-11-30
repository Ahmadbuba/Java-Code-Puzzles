package practice.strings;

public class StringsPractice {
	public static void main(String[] args) {
//		System.out.println("hello world");
		
		boolean hungry = (3<5);
		
		
		if(getValue()) {
			System.out.println("pigout");
		} else if(hungry == false) {
			System.out.println("I am already full");
		}
		else {
			System.out.println("I'm sleeping I don't care about hunger");
		}
		
		System.out.println(dogTrouble(true,6)); // true
		System.out.println(dogTrouble(true,7)); // false
		System.out.println(dogTrouble(false,6)); // false
	
	}
	
	public static boolean getValue() {
		return true;
	}
	
	
	public static boolean dogTrouble(boolean barking, int hour) {
		if(barking && (hour < 7 || hour > 20)) {
			return true;
		} else {
			return false;
		}
	}
}
