import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,0,1,2,-1,-4};
//		Arrays.sort(arr);
//		int zeroIndex = Arrays.binarySearch(arr, 0);
//		System.out.println(zeroIndex);
//		int[] arr2 = {-10,-9,8};
//		System.out.println(Arrays.binarySearch(arr2, 0));
//		int[] check = {1,2,3,3,3,3,3,3,3,3,5,7,8,9};
//		System.out.println(Arrays.toString(getRange(check, 5)));
		System.out.println(solution(arr));
		
	}
	
	public static List<List<Integer>> solution(int[] nums){
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		int len = nums.length;
		// If all positive or all negetive return empty list
		boolean empty1 = nums[0] > 0 || nums[len-1] < 0;
		// If starts/end with zero and there aren't three zeroes
		boolean empty2 = nums[0] == 0 && nums[2] != 0;
		boolean empty3 = nums[len-1] == 0 && nums[len-3] != 0;
		if (empty1 || empty2 || empty3) return ans;
		if ((nums[0]==0 && nums[2]==0)||(nums[len-1]==0 && nums[len-3]==0)) {
			List<Integer> l = new LinkedList();
			l.add(0); l.add(0); l.add(0);
			ans.add(l);
			return ans;
		}
		int i = 0;
		while (i < len-2) {
			for(int j=i+1; j<len-1;j++) {
				int k = Arrays.binarySearch(nums, j+1, len, -nums[i]-nums[j]);
				if (k >= 0) {
					List<Integer> l = new LinkedList();
					l.add(nums[i]); l.add(nums[j]); l.add(nums[k]);
					ans.add(l);
				}
			}
			while (nums[i+1] == nums[i]) {
				i++;
				continue;
			}
			i++;
		}
		
		return ans;
	}
	
	public static int[] getRange(int[] arr, int i) {
		int[] ans = {i,i};
		int val = arr[i];
		int start = i, end = i;
		while (start >=0 && arr[start-1] == val) {
			start--;
		}
		ans[0] = start;
		while ( end < arr.length && arr[end+1] == val) {
			end++;
		}
		ans[1] = end;
		return ans;
	}

}
