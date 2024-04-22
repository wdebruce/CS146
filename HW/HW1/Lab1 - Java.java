/**Lab1
 * HW1 Problem:
	Given an array of integers nums and an integer target, 
	return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice.
	You can return the answer in any order.
	Hint: There are 3 well known ways to solve this problem!
 */
public class Lab1{
	int[] twoIndices = new int[2];
	public Lab1() {}
	public static void main(String[] args) {
		//test cases
		//call method
		//print answer
		Lab1 lab1 = new Lab1();
		
		
		//Test Case #1
		int[] intArrayA = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		int target = 10;
		int[] answer = lab1.computeIndices(intArrayA, target);
		System.out.println("Array: " + printIntArr(intArrayA));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
		
		//Test Case #2
		int[] intArrayB = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		target = 100;
		answer = lab1.computeIndices(intArrayB, target);
		System.out.println("Array: " + printIntArr(intArrayB));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
		
		//Test Case #3
		int[] intArrayC = {-10, -5, -6, -2, -4};
		target = 11;
		answer = lab1.computeIndices(intArrayC, target);
		System.out.println("Array: " + printIntArr(intArrayC));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
		
		//Test Case #4
		int[] intArrayD = {9, 9, 9, 9, 9};
		target = 9;
		answer = lab1.computeIndices(intArrayD, target);
		System.out.println("Array: " + printIntArr(intArrayD));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
		
		//Test case #5
		int[] intArrayF = {-1, 2, -3, 4, -5, -6, 7};
		target = 6;
		answer = lab1.computeIndices(intArrayF, target);
		System.out.println("Array: " + printIntArr(intArrayF));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
		
		//Test case #6
		int[] intArrayG = {};
		target = 1;
		answer = lab1.computeIndices(intArrayG, target);
		System.out.println("Array: " + printIntArr(intArrayG));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer) + "\n");
	}
	
	//calls the search and returns the indices found
	public int[] computeIndices(int[] arr, int target) {
		boolean iEqTarget = searchArr(arr, target);
		if(iEqTarget) {
			return twoIndices;
		}
		return null;
	}
	
	//searches for the 2 indices of numbers that equate target
	public boolean searchArr(int[] arr, int target) {
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				int sum = arr[i] + arr[j];
				if(arr[i] != arr[j] && sum == target) {
					twoIndices[0] = arr[i];
					twoIndices[1] = arr[j];
					return true;
				}
			}
		}
		
		return false;
	}
	
	//prints out an array
	public static String printIntArr(int[] arr) {
		try {
		String s = "[";
		for(int i = 0; i < arr.length; i++) {
			if(i<arr.length-1) {s+=arr[i] + ", ";}
			if(i == arr.length-1) {s+=arr[i];}
		}
		s+= "]";	
		return s;
		}catch(NullPointerException e) { 
			//catches null, when answer can't be found
			return "Cannot Compute";
		}
	}
}
