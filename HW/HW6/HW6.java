import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Homework 6
/**Now that we're done discussing math-heavy stuff, here's another algorithmic problem! Here's the problem statement:

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

This time, your problem has additional details:

Constraints:

The solution set must not contain duplicate triplets.
The order of the output and the order of the triplets does not matter.
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

public class HW6 {
	public static void main(String[] args) {
		HW6 test = new HW6();
		int[] nums1 = {0, 1, 1};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: Expected: [], Actual: " + test.threeSum(nums1));
        
        int[] nums2 = {-5, 0, 5, 10, -10, 0};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: Expected: [[-5, 0, 5], [-10, 0, 10]], Actual: " + test.threeSum(nums2));
		
		
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		
		if(3 <= nums.length  && nums.length <= 105) {
			for(int i = 0; i < nums.length-2; i++) {
				for(int j = i+1; j < nums.length-1;j++) {
					for(int k=j+1; k < nums.length; k++) {
						int sum = nums[i] + nums[j] + nums[k];
						if(sum == 0) {
							List<Integer> elementList = new ArrayList<Integer>();
							elementList.add(nums[i]);
							elementList.add(nums[j]);
							elementList.add(nums[k]);
							mainList.add(elementList);
						}//end of sum loop
					}//end of k loop
				}//end of j loop
			}//end of i loop
		}//end of nums.length check
		return mainList;
	}
}
