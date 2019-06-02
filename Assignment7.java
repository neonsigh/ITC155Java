import java.util.Arrays;

/*
 * 
	Write a modified version of the selection sort algorithm that selects 
	the largest element each time and moves it to the end of the array, 
	rather than selecting the smallest element and moving it to the beginning. 
	Will this algorithm be faster than the standard selection sort? What will 
	its complexity class (big-Oh) be?
 * 
 * 
 * ANS:
 * The original selection sort is O(n^2)
 * This modification is the same complexity and speed
 */
public class Assignment7 {

	public static void main(String[] args) {

		int[] numlist = { 12, 123, 1, 28, 183, 16 }; 
		System.out.println("Original array: " + Arrays.toString(numlist));
		System.out.println();
		selectionSortMod(numlist);
		System.out.println("Sorted array: " + Arrays.toString(numlist));
		
	}
	
	public static void selectionSortMod(int[] nums) {
		for (int i = nums.length -1; i > 0; i--) {
			// find index of largest element
			// set current index to largest
			int largest = i;
			// 
			for (int j = i - 1; j >= 0; j--) { // checking j, the position before i
				if (nums[j] > nums[largest]) { // if j is larger than prev largest
					largest = j; // then set j as the new largest
				}
			}
			swap(nums, i, largest); // swap largest to back
		}

	}

	
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}
