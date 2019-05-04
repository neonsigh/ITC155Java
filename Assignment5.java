
public class Assignment5 {

	public static void main(String[] args) {

		
		writeNums(4);
		System.out.println();	
		writeNums(12);
		System.out.println();
		writeNums(3);
		System.out.println();
		writeNums(17);
		System.out.println();
		writeNums(-8);
		System.out.println();
		writeNums(0);
		
	}

	
	public static void writeNums(int n) {
		if (n == 1) {
			System.out.print(n);			
		} else if (n > 1) { 
	        writeNums(n - 1);
	        System.out.print(", " + n);
		} else {
			throw new IllegalArgumentException("input must be greater than 0");
		}
	}
	
}
