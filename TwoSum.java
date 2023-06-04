import java.util.Arrays;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

       You may assume that each input would have exactly one solution, and you may not use the same element twice.

       You can return the answer in any order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,7,11,15};
		int[] ans = twoSum(nums, 22);
		print(ans);
	}
	/*
	 * 1. Sort the array
	 * 2. For i element search the right couple for which
	 *    nums[i] + nums[j] = target
	 *    search in the range (i, last-element]
	 */
	public static int[] twoSum(int[] nums, int target) {
		Arrays.sort(nums); //O(n*log n)
		for (int i=0; i<nums.length-1; i++) { //O(n*log n)
			int j = Arrays.binarySearch(nums, i+1, nums.length, target-nums[i]);
			if (j>0) return new int[] {i,j};
		}
		return new int[] {-1,-1};
	}
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
