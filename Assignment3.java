import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment3 {

	//countUnique(numList);
	
	public static void main(String[] args) {
		
		// create a list of numbers
		List<Integer> numList = new LinkedList<Integer>();
		numList.add(3); //1
		numList.add(7); //2
		numList.add(3);
		numList.add(-1); //3
		numList.add(2); //4
		numList.add(3);
		numList.add(7);
		numList.add(2);
		numList.add(15); //5
		numList.add(15);
		
		// create an empty list of numbers
		List<Integer> numListEmpty = new LinkedList<Integer>();
		
		// define and return number of unique values in Set for both lists 
		int results = countUnique(numList);
		System.out.println("Number of unique integer values is " + results);
		int results2 = countUnique(numListEmpty);
		System.out.println("Number of unique integer values is " + results2);
		
	}


	public static int countUnique(List<Integer> list) {
		
		Set<Integer> numSetUnique = new TreeSet<Integer>();
		// print original list
		System.out.println(list);
		for (Integer i : list) 
            numSetUnique.add(i); 
		// print Set of unique numbers
		System.out.println(numSetUnique);
		
		return numSetUnique.size();
	}
}

