import java.util.HashMap; 

//Maps are pretty much lookup tables
public class HashTablesExamples {

	public static void main(String[] args) {

		//intializing a hashmap with the name empID
		HashMap<String, Integer> empID = new HashMap<>(); 
		
		//inputinng data into the hash map 
		// (key, value) 
		empID.put("John", 123);
		empID.put("Carl", 456);
		empID.put("Jerry", 789);
		
		//printing out whats in the hashmap
		System.out.println(empID); 
		
		//finding a key's value 
		System.out.println(empID.get("Carl")); 
		
		//Checking to see if the a key Jerry exists in the hashmap 
		System.out.println(empID.containsKey("Jerry"));
		
		//Checks to see if a value exists within the hashmap
		System.out.println(empID.containsValue(6));
		
		//Will Overwrite an existing key's data
		//mainly used to add in new entries 
		empID.put("John", 98765);
		System.out.println(empID); 

		//Can only change values to exisiting keys 
		empID.replace("Bob",999);
		System.out.println(empID); 

		//Another method to add a key+value, if the key doesn't already exist 
		empID.putIfAbsent("steve", 222);
		System.out.println(empID); 

		//Removing key-value pair from the map 
		empID.remove("steve");
		System.out.println(empID); 
		
		
	}

}
