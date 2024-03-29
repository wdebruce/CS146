/**Lab1 for CS146, SJSU
/*Programmed by William De Bruce*
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
		
		int[] intArray = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		int target = 10;
		
		int[] answer = lab1.computeIndices(intArray, target);
		
		//Test Case #1
		System.out.println("Array: " + printIntArr(intArray));
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
		
		//Test Case #2
		target = 7;
		answer = lab1.computeIndices(intArray, target);
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
		
		//Test Case #3
		target = 100;
		answer = lab1.computeIndices(intArray, target);
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
		
		//Test Case #4
		int[] intArray1 = {9, 9, 9, 9, 9};
		target = 18;
		answer = lab1.computeIndices(intArray1, target);
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
		
		//Test case #5
		int[] intArray2 = {10, 9, -1, 8, 7, 6, 5, 4, 3, 2, 1};
		target = 2;
		answer = lab1.computeIndices(intArray2, target);
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
		
		//Test case #6
		int[] intArray3 = {1, 1, 1, 0, 1, 1, 1};
		target = 1;
		answer = lab1.computeIndices(intArray3, target);
		System.out.println("Target: " + target);
		System.out.println("2 indices of numbers that equal Target: " + printIntArr(answer));
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
				if(arr[i] == arr[j]) {
					continue;
				}else if(sum == target) {
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
			if(i == arr.length-1) {
				s+=arr[i] + "]";	
			}
			if(i<arr.length-1) {s+=arr[i] + ", ";}
		}
		return s;
		}catch(NullPointerException e) { 
			//catches null, when answer can't be found
			return "Cannot Compute";
		}
	}
}
