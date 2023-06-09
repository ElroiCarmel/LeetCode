
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

       You may assume that each input would have exactly one solution, and you may not use the same element twice.

       You can return the answer in any order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,7,11,15};
		int[] ans = twoSum(nums, 9);
		print(ans);
	}
	/*
	 * Using HashMap for better time-complexity
	 */
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> seen = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++) {
			int diff = target-nums[i];
			if (seen.get(diff)!=null) {
				return new int[] {seen.get(diff), i};
			}
			seen.put(nums[i], i);
		}
		return new int[] {-1,-1};
		
	}
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
