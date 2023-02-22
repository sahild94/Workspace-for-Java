import java.math.*;

public class CharPractice {

	public static void main(String[] args) {
	//String s = "aabbccddeefff"; 
     String s = "abccccdd"; 
	//declare array char_counts of 128 integers (0-127)
	// its 128, so we get the entire ascii table 
	int [] characters = new int[128]; 
	//recives integer and follows ascii table 
	char test = 60 ;
	
	for(char c1 : s.toCharArray()){
		characters[c1]++;
            System.out.println( c1 ); //c1 contains individual letters
            System.out.println(  characters[c1] ); // adding up all the same letters (shows only the count), storing it the appropriate index 
        }
	
	//so what im really confused about is how its counting that theres like x numbers at 100
	
    int result = 0;

    for(int i: characters){
        result = result + ( i/2 * 2) ; 
       System.out.println(result);


       if(result%2 == 0 && i%2 == 1){
        result = result + 1;
        } 
    }
    
    System.out.println(result);

	//System.out.println(char_counts[100]);
	//System.out.println(test);
	
	
	}
}
