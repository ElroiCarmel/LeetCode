import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1,0,1,0 };
		System.out.println(solution(arr));

	}

	public static List<List<Integer>> solution(int[] nums) {
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		int len = nums.length;
		int i = 0;
		while (i < len - 2 && nums[i] <= 0) {
			int t = -nums[i];
			// Search for 2-sum
			int s = i + 1, e = len - 1;
			while (s < e) {
				if (nums[s] + nums[e] == t) {
					List<Integer> l = new LinkedList<Integer>();
					l.add(nums[i]);
					l.add(nums[s]);
					l.add(nums[e]);
					ans.add(l);
					while (s+1 < len && nums[s + 1] == nums[s])
						s++;
					while (e-1 >=0 && nums[e - 1] == nums[e])
						e--;
					s++;
					e--;
				} else if (nums[s] + nums[e] < t)
					s++;
				else {
					e--;
				}
			}
			// Skip duplicates
			while (i+1 < len && nums[i+1]==nums[i]) i++;
			i++;
		}
		return ans;
	}

}
