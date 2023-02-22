//Creating a method "essentially another function" to do your work
public class CreatingAMethodExample {

	public static void main(String[] args) {
	
		printName("John", 25);
	}
	
	// void means no return. If you want to return something change void to String, Integer etc 
	// private means it can only be called within the fill 
	// Can make it public if you want to use it in other places 
	
	//static Key word just means you can use it with calling individual objects 
	private static void printName(String name, int number) {
		
		System.out.println("My Name is " + name + number); 
	}
	
}
