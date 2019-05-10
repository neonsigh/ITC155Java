import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Midtermpt1 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(4);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(7);
		list1.add(2);
		list1.add(4);
		list1.add(9);
		list1.add(4);
		
		
		System.out.println("mode in list1 appears " + maxOccurrences(list1) + " times");
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(34);
		list2.add(3);
		list2.add(38);
		list2.add(32);
		list2.add(31);
		list2.add(14);
		list2.add(8);
		list2.add(34);
		list2.add(34);
		
		System.out.println();
		System.out.println("mode in list2 appears " + maxOccurrences(list2) + " times");
		
	}

	
	public static int maxOccurrences(List<Integer> list) {
		
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
	Iterator<Integer> i = list.iterator();
	
	while (i.hasNext()) {
		int num = i.next();
		
		if (map.containsKey(num)) {			
			map.put(num, map.get(num) + 1);				
		} else {		
			map.put(num, 1);
		}
	}
	
	Set<Integer> setKey = map.keySet();	
	i = setKey.iterator();
	int mode = 0;
	
	while(i.hasNext()) {
		int current = map.get(i.next());	
		if (current > mode) {
			mode = current;
		}
	}
	return mode;
	}
	
}

// Exercise 2 results:
// It compares i to the item preceding i and 
// puts the lesser of the two numbers as first in each pair being compared:

// [1, 2, 6, 8]
// [10, 30, 40, 20, 60, 50]
// [-4, 1, 25, 4, 16, 9, 64, 36, 49]


// Exercise 3 results:
// mystery3(6) returns: 6 (because n < 10)
// mystery3(17) returns: 8 (because it gives 1 + 7)
