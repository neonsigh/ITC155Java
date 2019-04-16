import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// create and add elements to an array list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Marty Stepp");
		names.add("Stuart Reges");
		names.add("Alan Turing");
		names.add("Ada Lovelace");
		names.add("Katherine Johnson");
		names.add("Williamina Fleming");
		names.add("Grace Hopper");
		names.add("Annie Easley");
		names.add("Mary Allen Wilkes");
		names.add("Adele Goldberg");
		names.add("Joan Ball");
		names.add("Karen Sparck Jones");
		names.add("Elizabeth Feinler");
		names.add("Carol Shaw");
		names.add("Susan Kare");
		names.add("Donna Dubinsky");
		names.add("Megan Smith");
		names.add("Victoria Alonso");
		names.add("Angelica Ross");
		names.add("Delia Derbyshire");
		names.add("Suzanne Ciani");
		

		System.out.println(names);
		removeEvenLength(names);
		System.out.println(names);	
			
		}

	public static void removeEvenLength(ArrayList<String> names) {
		for (int i = 0; i < names.size(); i++) {
			String word = names.get(i);
			if (word.length() % 2 == 0) {
				names.remove(i);
				i--;
			}
		}
		
	}
	
}



