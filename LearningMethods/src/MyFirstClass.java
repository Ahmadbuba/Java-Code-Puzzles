
public class MyFirstClass {

	public static void main(String[] args) {
		printHello();
		
		int myNumb = sumThese(2,4);
		System.out.println(myNumb);
	}
	
	static void printHello() {
		System.out.println("Hello there....");
	}
	
	static int sumThese(int firstArg, int secondArg) {
		return firstArg + secondArg;
	}
}
