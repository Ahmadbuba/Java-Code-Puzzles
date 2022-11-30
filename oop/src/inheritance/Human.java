package inheritance;

public class Human extends Animal {
	String name = "John";
	
	public static void main(String[] args) {
		Human s1 = new Human();
		System.out.println(s1.type);
		System.out.println(s1.name);
		
		Animal s2 = new Animal();
		System.out.println(s2.type);
	}
}


