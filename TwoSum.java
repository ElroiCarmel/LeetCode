import java.util.Arrays;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

       You may assume that each input would have exactly one solution, and you may not use the same element twice.

       You can return the answer in any order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,3};
		int[] ans = twoSum(nums, 6);
		print(ans);
	}
	/*
	 * 1. Sort the array
	 * 2. For i element search the right couple for which
	 *    nums[i] + nums[j] = target
	 *    search in the range (i, last-element]
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] help = nums.clone(); //O(n)
		Arrays.sort(help); //O(n*log n)
		for (int i=0; i<help.length-1; i++) { //O(n*log n)
			int j = Arrays.binarySearch(help, i+1, help.length, target-help[i]);
			if (j>0) {
				int io = simpleSearch(nums, help[i], -1);
				int jo = simpleSearch(nums, help[j], io);
				return new int[] {io,jo};
			}
		}
		return new int[] {-1,-1};
	}
	public static int simpleSearch(int[] arr, int k, int skip) {
		for (int i=0;i<arr.length;i++) {
			if (i==skip) continue;
			if (arr[i]==k) return i;
		}
		return -1;
	}
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
