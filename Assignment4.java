import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment4 {

	public static void main(String[] args) {
		// create map one and its key/values
		Map<String, String> checkUnique = new TreeMap<>();
		checkUnique.put("Marty", "Stepp");
		checkUnique.put("Stuart", "Reges");
		checkUnique.put("Jessica", "Miller");
		checkUnique.put("Amanda", "Camp");
		checkUnique.put("Hal", "Perkins");
		// check if map one (checkUnique) is unique
		System.out.println(isUnique(checkUnique));
		
		
		Map<String, String> checkUnique2 = new TreeMap<>();
		// create map two and its key/values
		checkUnique2.put("Kendrick", "Perkins");
		checkUnique2.put("Stuart", "Reges");
		checkUnique2.put("Jessica", "Miller");
		checkUnique2.put("Bruce", "Reges");
		checkUnique2.put("Hal", "Perkins");
		// check if map two (checkUnique2) is unique
		System.out.println(isUnique(checkUnique2));

		
	}
	
	// check map values for duplicates
	// if duplicate exists return false
	// if !duplicate return true
	public static boolean isUnique(Map<String, String> map) {
		Set<String> nameSetUnique = new HashSet<String>();
		for (String name : map.values()) {
			if (nameSetUnique.contains(name)) {
				return false;
			} else {
				nameSetUnique.add(name);
			}		
			System.out.println(nameSetUnique);
		} 
		return true;

	}
}
