package Ch12exercises;

import java.util.HashMap;
import java.util.Map;

public class CompareMaps {
			
	/*
	 * make a to make a call to the getOriginalGrades() and getMakeUpGrades() methods to get these Maps.
	   Then go through the Maps, and determine the final grade based on which one of these are higher.
	   Then print the final grades.
	 */

	public static void compareMaps(Map <String, Integer> original, Map<String, Integer> backup) {
		
		//first get the maps from the methods
		original = TestResults.getOriginalGrades();
		backup = TestResults.getMakeUpGrades();
		
		
		for (var entry : original.entrySet()) {
			//if (entry.getValue() < entry.getValue());
			int originalEntry = original.get(entry);
			if (originalEntry > backup.get(entry)) {
				System.out.println("it works");
			} 
		}
		
		//Map has a put method, which is used to add the elements. The put method takes two arguments — a key and a value
		//if you call put(key, value) passing in a key that already exists, the map will update that entry with the new value that was passed in
		//getObjectKey returns the value associated with the key
		
	}
	
	
}
